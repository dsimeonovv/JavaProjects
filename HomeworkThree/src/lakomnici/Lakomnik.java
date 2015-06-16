package lakomnici;

public class Lakomnik extends Thread {

	private String name;
	private Vilica leftHandVilica;
	private Vilica rightHandVilica;
	private boolean isFinished;
	private boolean isEating;
	private Table table;

	public Lakomnik(String name) {
		super();
		this.name = name;
	}

	public Vilica getLeftHandVilica() {
		return leftHandVilica;
	}

	public void setLeftHandVilica(Vilica leftHandVilica) {
		this.leftHandVilica = leftHandVilica;
	}

	public boolean isEating() {
		return isEating;
	}

	public void setEating(boolean isEating) {
		this.isEating = isEating;
	}

	public Vilica getRightHandVilica() {
		return rightHandVilica;
	}

	public void setRightHandVilica(Vilica rightHandVilica) {
		if (this.rightHandVilica != null) {
			return;
		} else {
			rightHandVilica.setBusy(true);
			this.rightHandVilica = rightHandVilica;
		}
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	@Override
	public String toString() {
		return "Lakomnik [name=" + name + ", leftHandVilica=" + leftHandVilica
				+ ", rightHandVilica=" + rightHandVilica + ", isFinished="
				+ isFinished + ", isEating=" + isEating + "]";
	}

	public synchronized void eat() {
		try {
			isEating = true;
			System.out.println("eating " + this);
			Thread.sleep(10000);
			System.out.println("done with eatingi " + this);
			isEating = false;
			isFinished = true;
			leftHandVilica.setBusy(false);
			rightHandVilica.setBusy(false);
			leftHandVilica = null;
			rightHandVilica = null;
		} catch (InterruptedException e) {
		}
	}

	public void run() {
		synchronized (this) {
			while (leftHandVilica == null || rightHandVilica == null) {
				try {
					System.out.println("waiting for fork - " + this);
					this.wait();
					System.out.println("woke up lakomnik - " + this);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		eat();
		synchronized (table) {
			table.notify();
		}

	}

	public void giveVilica() {
		System.out.println("give vilica ");
	}

}
