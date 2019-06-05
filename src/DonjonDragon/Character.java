package DonjonDragon;

import java.util.Scanner;

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

    // Getters and Setters
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

    // Methods
    public void updateInfo() {
        System.out.println("1 nom :" + this.getName());
        System.out.println("2 : image" + this.getImage());
        System.out.println("3 : niveau de vie " + this.getLifeLevel());
        System.out.println("4 : puissance attaque" + this.getAttackPower());
        System.out.println("5 : défense" + this.getDefense());
        System.out.println("Quelle caractéristique voulez-vous modifier (entrer son numéro) ?");
        Scanner sc = new Scanner(System.in);
        int attSelected = sc.nextInt();
        sc.nextLine();
        switch (attSelected) {
            case 1:
                System.out.println("Entrer le nouveau nom du personnage : ");
                String sName = sc.nextLine();
                this.setName(sName);
                break;
            case 2:
                System.out.println("Entrer la nouvelle url de l'image : ");
                String sImage = sc.nextLine();
                this.setImage(sImage);
                break;
            case 3:
                System.out.println("Entrer le nouveau niveau de vie : ");
                int sLifeLevel = sc.nextInt();
                sc.nextLine();
                this.setLifeLevel(sLifeLevel);
                break;
            case 4:
                System.out.println("Entrer la nouvelle puissance d'attaque : ");
                int sAttackPower = sc.nextInt();
                sc.nextLine();
                this.setAttackPower(sAttackPower);
                break;
            case 5:
                System.out.println("Entrer votre nouveau moyen de défense (philtre(M) bouclier(G) : ");
                String sDefense = sc.nextLine();
                this.setDefense(sDefense);
                break;
            case 9:
                break;
            default:
                System.out.println("mauvais choix de caractéristique");
        }
    }
}
