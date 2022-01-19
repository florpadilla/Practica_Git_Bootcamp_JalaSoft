package epicbattle;

public enum CharactersType {
    HUMANS(50, 8, 10),
    ELVES(70, 5, 8),
    ORCS(80, 3, 15);

    private double life;
    private int attack;
    private int armor;

    CharactersType(double life, int attack, int armor) {
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
