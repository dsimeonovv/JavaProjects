package kontrolnogame;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		Hero hero = new Archer((byte)100,(byte) 50,(byte) 4);
		Hero hero2 = new Warrior((byte)120,(byte) 60,(byte) 10);
		Hero hero3 = new Barbarian((byte)120,(byte) 65,(byte) 5);
		
		System.out.println(hero.getClass().getSimpleName() + " atack = " + hero.calculateAtack(hero2));
		System.out.println(hero2.getClass().getSimpleName() + " deffence = " + hero2.calculateDeffence(hero3));
		System.out.println(hero3.getClass().getSimpleName() + " atack = " + hero3.calculateAtack(hero));
		
		War.autoAttack(hero2,hero);
		
		List<Hero> firstArmy = new ArrayList<Hero>();
		List<Hero> secondArmy = new ArrayList<Hero>();
		
		firstArmy.add(hero);
		firstArmy.add(hero2);
		
		secondArmy.add(hero3);
		secondArmy.add(hero2);
		
		
		
	}
}
