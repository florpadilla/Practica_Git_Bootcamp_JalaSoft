package epicbattle;

public class Battle {
    Characters character1;
    Characters character2;

    public Battle(Characters character1, Characters character2){
        this.character1=character1;
        this.character2=character2;
    }
    public double damage(Characters character1, Characters character2){
        return character1.totalAttack()-character2.totalDeffense();
        //es como que aquí necesitaría un getTotalAttack segun lo que entiendo.
    }
}
