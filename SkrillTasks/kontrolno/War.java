package kontrolno;

public class War {

	public static boolean autoAttack(Hero a, Hero d) {
		{
			// while someone is dead
			int count = 0;

			while (true) {
				System.out.println("===== batle =====");
				System.out.println(a.toString());
				System.out.println(d);
				if (count % 2 == 0) {
					a.atack(d);
					if(!d.isAlive()){
						System.out.println("Atacker wins");
						return true;
					}
				} else {
					d.atack(a);
					if(!a.isAlive()){
						System.out.println("Atacker lose");
						return false;
					}
				}
				count++;
			}
		}

	}
}
