package lakomnici;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
//		Lakomnik lakomnik = new Lakomnik("lakomnik0");
//		lakomnik.start();
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Vilica rvilica = new Vilica(false);
//		Vilica lvilica = new Vilica(false);
//		
//		lakomnik.setLeftHandVilica(lvilica);
//		synchronized (lakomnik) {
//			lakomnik.notify();
//		}
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		lakomnik.setRightHandVilica(rvilica);
//		synchronized (lakomnik) {
//			lakomnik.notify();
//		}
		List<Lakomnik> lakomnici = new ArrayList<>();
		List<Vilica> vilici = new ArrayList<>();
		
		for (int i = 0; i < 12; i++) {
			vilici.add(new Vilica(false));
			lakomnici.add(new Lakomnik("Lakomnik:" + (i)));
		}
		
		Table table = new Table(lakomnici, vilici);
		
		table.start();
	}
}
