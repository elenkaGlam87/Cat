package myfirstobject.myhomework.hero.hero;

import myfirstobject.myhomework.hero.enemy.Enemy;

public class TrainingGround {
    public static void main(String[] args) {

        Hero warrior = new Warrior("Ben", 20, 50);
        Hero mage = new Mage("Nik",45, 70);
        Hero archer = new Archer("James",57, 80);
        Enemy enemy1 = new Enemy(60, 20);
        Enemy enemy2 = new Enemy(37, 10);
        Enemy enemy3 = new Enemy(29, 5);

        warrior.attackEnemy(enemy2);
        mage.attackEnemy(enemy3);
        archer.attackEnemy(enemy1);

    }
}
