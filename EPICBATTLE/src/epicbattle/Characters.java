package epicbattle;
//de la clase personajes defino como atributos un alias y que digan de que tipo y clase serán y qué armas elijen
public class Characters {
    private String alias;
    private CharactersType charactersType;
    private ClassesType classesType;
    private Weapons weapons;

//luego defino los metodos.. primero este metodo constructor
    public Characters(String alias, CharactersType charactersType, ClassesType classesType, Weapons weapons) {
        this.alias = alias;
        this.charactersType = charactersType;
        this.classesType = classesType;
        this.weapons = weapons;
    }
    //metodos para calculaar el total de puntos de defensa que tendrá como la suma de lo que tenga por el tipo y por la clase que sea
    public double totalDeffense(ClassesType classesType, CharactersType charactersType){
        return this.getCharactersType().getArmor()+this.getClassesType().getDeffense();
    }
    //metodo para calcular el total de puntos de ataque, que yo digo que será el total de puntos de ataque(los que tenga por clase y por tipo) multiplicado por el modificador del arma

    public double totalAttack(ClassesType classesType, CharactersType charactersType, Weapons weapons){
        return (this.getClassesType().getAttack()+this.getCharactersType().getAttack())*this.getWeapons().getModifier();
    }
    //luego hago un metodo para que segun el daño calculado, me reste puntos de vida...
    //Aquí no estoy segura si es que el "damage" que ingreso es o no el que viene de la clase Battle
    public void takeDamage(double damage) {
        this.getCharactersType().setLife(getCharactersType().getLife()-damage);
    }

    @Override
    public String toString() {
        return "Characters{" +
                "alias='" + alias + '\'' +
                ", charactersType=" + charactersType +
                ", classesType=" + classesType +
                ", weapons=" + weapons +
                '}';
    }

//getters y setters

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public CharactersType getCharactersType() {
        return charactersType;
    }

    public void setCharactersType(CharactersType charactersType) {
        this.charactersType = charactersType;
    }

    public ClassesType getClassesType() {
        return classesType;
    }

    public void setClassesType(ClassesType classesType) {
        this.classesType = classesType;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }
}
