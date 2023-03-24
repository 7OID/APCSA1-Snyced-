package unit7;

public class PokemonRunner {
    public static void main(String[] args) {
        FireAttack flamethrower = new FireAttack("Flamethrower", 80);
        FirePokemon charmander = new FirePokemon("Charmander", 5, 50, flamethrower);

        System.out.println(charmander);
        System.out.println(charmander.getAttack());
        System.out.println(charmander.getHp());

        FireAttack fireBlast = new FireAttack("Fire Blast", 120);
        charmander.setAttack(fireBlast);
        charmander.setLevel(6);

        System.out.println(charmander);
        System.out.println(charmander.getAttack());

        FirePokemon charizard = new FirePokemon("Charizard", 36, 120, flamethrower);
        System.out.println(charizard);

        charmander.attack(charizard);
        System.out.println(charizard.getHp());

        ElectricAttack thunderShock = new ElectricAttack("Thunder Shock", 40);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 5, 40, thunderShock);

        System.out.println(pikachu);
        System.out.println(pikachu.getAttack());
        System.out.println(pikachu.getHp());

        pikachu.attack(charmander);
        System.out.println(charmander.getHp());
    }
}