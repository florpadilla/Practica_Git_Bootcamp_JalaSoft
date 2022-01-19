package epicbattle;

public enum ClassesType {
    MAGICIAN(20, -10),
    WARRIOR(10, 20),
    ROGUE(30, 0);

    private int attack, deffense;

    ClassesType(int attack, int deffense) {
        this.attack = attack;
        this.deffense = deffense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDeffense() {
        return deffense;
    }

    public void setDeffense(int deffense) {
        this.deffense = deffense;
    }
}
