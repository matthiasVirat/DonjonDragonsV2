package DonjonDragon;

import java.util.Scanner;

public class ManageCharacter {
    // Attributs

    // Constructors

    public ManageCharacter() {
    }

    // Methods
    public Character initCharacter() {
        Character C = new Character();
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("Magien (1) ou Guerrier (2) ?");
            int charType = sc.nextInt();
            sc.nextLine();

            System.out.println("Entrer le nom du personnage : ");
            String sName = sc.nextLine();

            System.out.println("Entrer l'url de l'image : ");
            String sImage = sc.nextLine();

            System.out.println("Entrer le niveau de vie : ");
            int sLifeLevel = sc.nextInt();
            sc.nextLine();

            System.out.println("Entrer la puissance d'attaque : ");
            int sAttackPower = sc.nextInt();
            sc.nextLine();

            System.out.println("Entrer votre moyen de défense (philtre(M) bouclier(G) : ");
            String sDefense = sc.nextLine();

            System.out.println("Nom : " +sName+ ", image : " +sImage+ ", Vie : " +sLifeLevel);
            System.out.println("Puissance : " +sAttackPower+ ", Défense : " +sDefense);

            System.out.println("Valider (1 oui 2 non)");
            int validate = sc.nextInt();

            if (validate == 1) {
                loop = false;
                if (charType == 1) {
                    Magician mag = new Magician(sName, sImage, sLifeLevel, sAttackPower, sDefense);
                    C = mag;
                } else {
                    Warrior war = new Warrior(sName, sImage, sLifeLevel, sAttackPower, sDefense);
                    C = war;
                }
            }
        }
        return C;
    }

    public Character[] createCharacter(Character[] tabCharacter) {
        int createNew;
        for (int i = 0; i < tabCharacter.length; i++) {
            if (tabCharacter[i] != null) {
                continue;
            } else {
                tabCharacter[i] = initCharacter();
                Scanner sc = new Scanner(System.in);
                System.out.println("Voulez-vous créer un autre personnage ? (1 oui 2 non)");
                createNew = sc.nextInt();
                sc.nextLine();
            }
            if (createNew == 2) {
                break;
            }
        }
        return tabCharacter;
    }

    public boolean isNotNull(Character[] tabCharacter) {
        boolean empty = true;
        if (tabCharacter != null) {
            for (Character character : tabCharacter) {
                if (character != null) {
                    empty = false;
                    break;
                }
            }
        }
        return empty;
    }

    public void listCharacterName(Character[] tabCharacter) {
        System.out.println("liste des personnages : ");
        int i = 0;
        for (Character character : tabCharacter) {
            if (character != null) {
                i++;
                System.out.println(i+ " : " + character);
            }
        }
    }

    public void updateCharacter(Character[] tabCharacter) {
        listCharacterName(tabCharacter);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel personnage voulez-vous modifier (entrer son numéro, 9 pour sortir) ?");
        int charSelected = sc.nextInt();
        sc.nextLine();
        Menu M = new Menu();
        if (charSelected == 9) {
            M.displayCharacterMenu();
        } else {
            tabCharacter[charSelected - 1].updateInfo();
        }
    }

    public void deleteCharacter(Character[] tabCharacter) {
        listCharacterName(tabCharacter);
        System.out.println("Quelle personnage voulez-vous supprimer (entrer son numéro, 9 pour quitter) ?");
        Scanner sc = new Scanner(System.in);
        int charSelected = sc.nextInt();
        sc.nextLine();
        if (charSelected == 9) {
            Menu M = new Menu();
            M.displayCharacterMenu();
        } else {
            tabCharacter[charSelected-1] = null;
        }
    }
}
