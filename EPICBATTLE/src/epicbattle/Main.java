package epicbattle;

public class Main {
    public static void main(String[] args) {
        Characters character1 = new Characters("Gandalf", CharactersType.ELVES, ClassesType.MAGICIAN, Weapons.SWORD);
        Characters character2 = new Characters("Esmirnof", CharactersType.HUMANS, ClassesType.ROGUE, Weapons.DAGGER);

        Battle battle1 = new Battle(character1, character2);
        battle1.golpe(battle1.character1, battle1.character2);

    }
}
