package RPG;

public class Mage extends Personnage{
    private int mana;
    private int intelligence;

    public Mage(String name){
        super(name, 80);
        this.mana = 100;
        this.intelligence = 25;
    }

    @Override
    public void lvlUp(){
        super.lvlUp();
        this.mana += 20;
        this.intelligence += 5;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Mana: " + this.mana + " / Intelligence: " + this.intelligence);
    }

    @Override
    public void attack(Personnage enemy){
        int damage = this.intelligence;
        enemy.takeDamage(damage);
        System.out.println(this.name + " casts a spell on " + enemy.name + " for " + damage + " damages");
    }

}