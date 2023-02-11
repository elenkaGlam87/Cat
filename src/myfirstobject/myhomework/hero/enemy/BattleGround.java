package myfirstobject.myhomework.hero.enemy;

import myfirstobject.myhomework.hero.hero.Archer;
import myfirstobject.myhomework.hero.hero.Hero;
import myfirstobject.myhomework.hero.hero.Mage;
import myfirstobject.myhomework.hero.hero.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Ben", 20, 50);
        Hero mage = new Mage("Nik", 10, 60);
        Hero archer = new Archer("James", 30, 70);

        Enemy enemy = new Enemy(195, 50);

        Hero[] heroes = {warrior, mage, archer};


        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                    enemy.attackHero(hero);
                }
            }
        }


    }
}
