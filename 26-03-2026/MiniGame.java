class Character{
    String name;
    Character(){
        this.name = "Maverick";
    }
    void attack(){
        System.out.println("Character is about to Attack!!");
    }
}

class Warrior extends Character{
    void attack(){
        System.out.println(name+" attacks with Sword.");
    }
}
class Archer extends Character{
    @Override
    void attack(){
        System.out.println(name+" attacks with Arrow.");
    }
}
class Mage extends Character{
    Mage(String name){
        super.name = name;
    }
    @Override
    void attack(){
        System.out.println(name+" attacks with Magic.");
    }
}

public class MiniGame {
    public static void main(String[] args) {
        Character c;
        c = new Character();
        c.attack();
        c = new Warrior();
        c.attack();
        c = new Archer();
        c.attack();
        c = new Mage("Heidi");
        c.attack();
    }
}
