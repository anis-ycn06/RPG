package RPG;

public class Heal implements Capacity {
    @Override
    public void use(Personnage user, Personnage enemy){
        System.out.println(user.name + " uses Heal!");
        enemy.heal(20);
        
    }
    
}
