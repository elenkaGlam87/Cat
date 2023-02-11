package myfirstobject.myhomework.hero.hero;
/**
 * 3. Создать класс Enemy, представляющий собой врага и содержащий поле
 * health (количество здоровья).

 * Метод должен вызывать у врага метод takeDamage и передавать в него
 * определённое количество урона.
 * Переопределить метод в подклассах Warrior, Mage и Archer так, чтобы
 * каждый герой наносил врагу разное количество урона.
 * <p>
 * 4. Сделать класс Hero и его метод attackEnemy абстрактными.
 * 5. Создать интерфейс Mortal, содержащий метод isAlive().
 * Сделать так, чтобы класс Enemy реализовывал интерфейс Mortal.
 * Определить метод isAlive в классе Enemy так, чтобы тот возвращал true,
 * если количество здоровья врага больше 0.
 * <p>
 * 6. Создать класс BattleGround с методом main, в котором создать симуляцию
 * героя, атакующего врага.
 * 7*. Добавить герою показатель здоровья и возможность погибнуть.
 * Добавить возможность врагу атаковать героя в ответ.
 * Создать несколько видов врагов (наследников класса Enemy) с разными
 * способностями (например, Zombie - имеет шанс воскреснуть при гибели)
 * Дать героям уникальные способности.
 * Продемонстрировать сражение героя с несколькими соперниками.
 */

import myfirstobject.myhomework.hero.enemy.Enemy;
import myfirstobject.myhomework.hero.enemy.Mortal;

public abstract class Hero implements Mortal {
    private String name;
    private int damageHero;

    private int healthHero;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damageHero = damage;
        this.healthHero=health;
    }

    public String getName() {
        return name;
    }

    public int getDamageHero() {
        return damageHero;
    }

    public int getHealthHero() {
        return healthHero;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return healthHero>0;
    }

    public int heroTakeDamage(int damage) {
        healthHero = healthHero - damage;
        if (healthHero <= 0) {
            return healthHero = 0;
        } else return healthHero;
    }
}
