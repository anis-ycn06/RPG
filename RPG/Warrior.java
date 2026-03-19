package RPG;

public class Warrior extends Personnage {

    private int strength;
    private int defense;

    public Warrior(String name){
        super(name, 120);
        this.strength = 20;
        this.defense = 10;
    }


    @Override
    public void lvlUp(){
        super.lvlUp();
        this.strength += 5;
        this.defense += 4;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Strength: " + this.strength + " / Defense: " + this.defense);
    }

    @Override
    public void takeDamage(int damage){
        damage -= this.defense / 2;
        if(damage < 0){
            damage = 0;
        }
        super.takeDamage(damage);
    }

    @Override
    public void attack(Personnage enemy){
        int damage = this.strength;
        enemy.takeDamage(damage);
        System.out.println(this.name + " attacks " + enemy.name + " for " + damage + " damages." );
    }
}


