package DonjonDragon;

public class Character {
    // Attributs :
    protected String name;
    protected String image;
    protected int lifeLevel;
    protected int attackPower;
    protected AttackMode attackMode;
    protected String defense;

    // Constructors :
    public Character() {
        name = "Pas de nom";
        image = "Pas d'image";
        lifeLevel = 0;
        attackPower = 0;
        attackMode = null;
        defense = "pas de défense";
    }

    public Character(String pName) {
        name = pName;
        image = "Pas d'image";
        lifeLevel = 0;
        attackPower = 0;
        attackMode = null;
        defense = "pas de défense";
    }

    public Character(String pName, String pImage, int pLifeLevel, int pAttackPower, String pDefense) {
        name = pName;
        image = pImage;
        lifeLevel = pLifeLevel;
        attackPower = pAttackPower;
        attackMode = null;
        defense = pDefense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public AttackMode getAttackMode() {
        return attackMode;
    }

    public void setAttackMode(AttackMode attackMode) {
        this.attackMode = attackMode;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }
}
