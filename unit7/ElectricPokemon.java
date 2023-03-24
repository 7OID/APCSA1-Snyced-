package unit7;

public class ElectricPokemon extends Pokemon {
    private ElectricAttack attack;
    private int hp;

    public ElectricPokemon(String name, int level, int hp, ElectricAttack attack) {
        super(name, level);
        this.hp = hp;
        this.attack = attack;
    }

    public ElectricAttack getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public void setAttack(ElectricAttack attack) {
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
        return super.toString() + " - Electric Type";
    }
}
