package unit7;

public class FirePokemon extends Pokemon {
    private FireAttack attack;
    private int hp;

    public FirePokemon(String name, int level, int hp, FireAttack attack) {
        super(name, level);
        this.hp = hp;
        this.attack = attack;
    }

    public FireAttack getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public void setAttack(FireAttack attack) {
        this.attack = attack;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack(Pokemon target) {
        System.out.println(this.getName() + " uses " + this.attack.getName() + " on " + target.getName() + "!");
        target.setHp(target.getHp() - this.attack.getDamage());
    }

    public String toString() {
        return super.toString() + " - Fire Type";
    }
}