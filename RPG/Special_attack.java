package RPG;

public class Special_attack implements Capacity {

    @Override
    public void use(Personnage user, Personnage enemy) {
        System.out.println(user.name + " uses a special attack on " + enemy.name + "!");
        enemy.takeDamage(30);
    }

}
