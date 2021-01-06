package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero) {
        double attack = physAtt * (1 - hero.physDef);
        if (hero.health - attack < 0) {
            hero.health = 0;
        } else {
            hero.health -= attack;
        }
    }
}
