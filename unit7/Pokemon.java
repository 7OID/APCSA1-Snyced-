package unit7;

public class Pokemon {
    private String name;
    private int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void attack(Pokemon target) {
        System.out.println(this.name + " attacks " + target.getName() + "!");
    }

    public String toString() {
        return name + " (Level " + level + ")";
    }
}