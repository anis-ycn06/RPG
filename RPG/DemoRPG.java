package RPG;
public class DemoRPG {
    public static void main(String[] args){
        Warrior w = new Warrior("Yugo");
        Mage m = new Mage("Amalia");
        Archer a = new Archer("Evangelyne");
        w.display();
        m.display();
        a.display();
        System.out.println("Let's start the battle!");
        w.attack(a);
        a.attack(w);
        w.heal(15);
        m.attack(w);
        a.attack(m);
        m.heal(10);
        w.attack(m);
    
        m.display();
        w.display();
        a.display();

    }
    
}
