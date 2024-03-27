
// Superclass Monster
class Monster {
    void attack() {
        System.out.println("Attack!");
    }
}


class FireMonster extends Monster {
    void attack() {
        System.out.println("Attack with fire!");
    }
}


class WaterMonster extends Monster {
    void attack() {
        System.out.println("Attack with water!");
    }
}


class StoneMonster extends Monster {
    void attack() {
        System.out.println("Attack with stones!");
    }
}

    public class java {
    public static void main(String[] args) {

        Monster fireMonster = new FireMonster();
        Monster waterMonster = new WaterMonster();
        Monster stoneMonster = new StoneMonster();
        Monster unknownMonster = new Monster();


        fireMonster.attack();
        waterMonster.attack();
        stoneMonster.attack();
        unknownMonster.attack();
    }
}
