package myfirstobject.myhomework.hero.hero;

import myfirstobject.myhomework.hero.enemy.Enemy;

public class Warrior extends Hero {


    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attacked an enemy");
        System.out.println("Enemy got damage " + getDamageHero() + "\n health Enemy: " + enemy.enemyTakeDamage(getDamageHero()));

    }
}
