package RPG;

public class Archer extends Personnage {
    private int precision;
    private int speed;

    public Archer(String name){
        super(name, 100);
        this.precision = 15;
        this.speed = 20;
    }

    @Override
    public void lvlUp(){
        super.lvlUp();
        this.precision += 5;
        this.speed += 5;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Precision: " + this.precision + "/ Speed: " + this.speed);
    }

    @Override
    public void attack(Personnage enemy){
        int damage = this.precision;
        enemy.takeDamage(damage);
        System.out.println(this.name + " shoots an arrow at " + enemy.name + " for " + damage + " damages");
    }
    

}
