package epicbattle;

public enum Weapons {
    SCREPTER(1.5),
    SWORD(2.0),
    DAGGER(1.2);

    private double modifier;

    Weapons(double modifier){
        this.modifier = modifier;
    }
    public double getModifier(){
        return modifier;
    }

}
