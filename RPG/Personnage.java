package RPG;

public abstract class Personnage {

    protected String name;
    protected int hpMax;
    protected int hp;
    protected int lvl;
    protected Capacity[] capacities = new Capacity[2];

    public Personnage(String name, int hpMax){
        this.name = name;
        this.hpMax = hpMax;
        this.hp = hpMax;
        this.lvl = 1;
    }

    public Boolean isAlive(){return this.hp > 0; }

    public void takeDamage(int damage){
        this.hp -= damage;
        if(this.hp < 0){
         this.hp = 0;}
    }

    public void heal(int heal){
        this.hp += heal;
        if(this.hp > this.hpMax){
            this.hp = this.hpMax;
        }
    }

    public void addCapacity(Capacity c){
        if(this.capacities[0] == null){
            this.capacities[0] = c;
        } else if(this.capacities[1] == null){
            this.capacities[1] = c;
        } else{
            System.out.println("Capacities are full !!");
        }

    }

    public void useCapacity(int i, Personnage enemy){
        if(this.capacities[i] != null){
            this.capacities[i].use(this, enemy);
        } else{
            System.out.println("No capacity in this slot !");
        }
    }

    public void lvlUp(){
        this.lvl ++;
        this.hpMax += 10;
        this.hp = this.hpMax;
    }

    public void display(){
        System.out.println(this.name + " | level: " + this.lvl + " | Hp: " + this.hp + "/" + this.hpMax);
    }

    public abstract void attack(Personnage enemy);


 }








