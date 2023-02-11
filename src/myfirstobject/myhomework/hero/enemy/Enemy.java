package myfirstobject.myhomework.hero.enemy;

import myfirstobject.myhomework.hero.hero.Hero;

public class Enemy implements Mortal {
    private int healthEnemy;
    private int damageEnemy;

    public Enemy(int health, int damage) {
        this.healthEnemy = health;
        this.damageEnemy=damage;
    }

    public void setHealthEnemy(int health) {
        this.healthEnemy = health;
    }

    public int getHealthEnemy() {
        return healthEnemy;
    }

    public void setDamageEnemy(int damage) {
        this.damageEnemy = damage;
    }

    public int getDamageEnemy() {
        return damageEnemy;
    }

    public int enemyTakeDamage(int damage) {
        healthEnemy = healthEnemy - damage;
        if (healthEnemy <= 0) {
            return healthEnemy = 0;
        } else return healthEnemy;
    }

    @Override
    public boolean isAlive() {
        return healthEnemy > 0;
    }

    public void attackHero(Hero hero) {
        System.out.println("Enemy attacked hero ");
        System.out.println("Hero got damage " + getDamageEnemy() + "\n health hero: " + hero.heroTakeDamage(getDamageEnemy()));

    }
}
