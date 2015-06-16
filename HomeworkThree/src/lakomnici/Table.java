package lakomnici;

import java.util.ArrayList;
import java.util.List;

public class Table extends Thread {
	private List<Lakomnik> lakomnici;
	private List<Vilica> vilici;

	public Table(List<Lakomnik> lakomnici, List<Vilica> vilici) {
		this.lakomnici = lakomnici;
		for (Lakomnik lakomnik : lakomnici) {
			lakomnik.setTable(this);
			lakomnik.start();
		}
		this.vilici = vilici;
	}

	public void run() {
		boolean isBeginning = true;
		System.out.println("Start battle for food");
		while (hasHungryMan()) {
			if (isBeginning) {
				for (int i = 0; i < lakomnici.size(); i++) {
					if (i % 2 == 0) {
						Lakomnik lakomnik = lakomnici.get(i);
						if (!lakomnik.isFinished() && !lakomnik.isEating()) {
							System.out.println("Give forks to " + lakomnik);
							giveVilici(lakomnik, i);
						}
					}
				}
				isBeginning = false;
			}

			for (int i = 0; i < lakomnici.size(); i++) {
				Lakomnik lakomnik = lakomnici.get(i);
				if (!lakomnik.isFinished() && !lakomnik.isEating()) {
					giveVilici(lakomnik, i);
				}
			}
			synchronized (this) {
				try {
					System.out.println("Waiting for free forks");
					this.wait();
					System.out.println("Woke up to give forks");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
		
		System.out.println("==== ALL GOOD" );
		for (Lakomnik lakomnik : lakomnici) {
			System.out.println(lakomnik);
		}
	}

	private void giveVilici(Lakomnik lakomnik, int i) {
		synchronized (lakomnik) {

			if (i >= 0 && i < vilici.size()) {
				// left hand
				if (!vilici.get(i).isBusy()) {
					lakomnik.setLeftHandVilica(vilici.get(i));
					System.out.println(lakomnik);
					lakomnik.notify();
				}
				// right hand
				if (i == 0) {
					if (!vilici.get(vilici.size() - 1).isBusy()) {
						lakomnik.setRightHandVilica(vilici.get(vilici.size() - 1));
						System.out.println(lakomnik);
						lakomnik.notify();
					}

				} else if (!vilici.get(i - 1).isBusy()) {
					lakomnik.setRightHandVilica(vilici.get(i - 1));
					System.out.println(lakomnik);
					lakomnik.notify();
				}
			}
		}
	}

	private boolean hasHungryMan() {

		for (Lakomnik lakomnik : lakomnici) {
			if (lakomnik.isFinished() == false) {
				return true;
			}
		}
		return false;
	}
}
