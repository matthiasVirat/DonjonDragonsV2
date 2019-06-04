package DonjonDragon;

public class AttackMode {
    // Attributs :
    private String name;
    private int attackLevel;

    public AttackMode() {
        name = "Pas d'arme";
        attackLevel = 0;
    }

    public AttackMode(String pName, int pAttackLevel) {
        name = pName;
        attackLevel = pAttackLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }
}
