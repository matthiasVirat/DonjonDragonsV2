package DonjonDragon;

import java.util.ArrayList;
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

    public void createCharacter(ArrayList<Character> listCharacter) {
        int createNew = 0;
        while (createNew != 2) {
            listCharacter.add(initCharacter());
            Scanner sc = new Scanner(System.in);
            System.out.println("Voulez-vous créer un autre personnage ? (1 oui 2 non)");
            createNew = sc.nextInt();
            sc.nextLine();
        }
    }

    public boolean isNotNull(ArrayList<Character> listCharacter) {
        boolean empty = true;
        if (listCharacter.size() != 0) {
            empty = false;
        }
        return empty;
    }

    public void listCharacterName(ArrayList<Character> listCharacter) {
        System.out.println("liste des personnages : ");
        int i = 0;
        for (Character character : listCharacter) {
            if (character != null) {
                i++;
                System.out.println(i+ " : " + character.getName());
            }
        }
    }

    public void updateCharacter(ArrayList<Character> listCharacter) {
        listCharacterName(listCharacter);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel personnage voulez-vous modifier (entrer son numéro, 9 pour sortir) ?");
        int charSelected = sc.nextInt();
        sc.nextLine();
        Menu M = new Menu();
        if (charSelected == 9) {
            M.displayMainMenu();
        } else {
            System.out.println(listCharacter.get(charSelected - 1));
            System.out.println("Quelle caractéristique voulez-vous modifier (entrer son numéro) ?");
            int attSelected = sc.nextInt();
            sc.nextLine();
            switch (attSelected) {
                case 1:
                    System.out.println("Entrer le nouveau nom du personnage : ");
                    String sName = sc.nextLine();
                    listCharacter.get(charSelected - 1).setName(sName);
                    break;
                case 2:
                    System.out.println("Entrer la nouvelle url de l'image : ");
                    String sImage = sc.nextLine();
                    listCharacter.get(charSelected - 1).setImage(sImage);
                    break;
                case 3:
                    System.out.println("Entrer le nouveau niveau de vie : ");
                    int sLifeLevel = sc.nextInt();
                    sc.nextLine();
                    listCharacter.get(charSelected - 1).setLifeLevel(sLifeLevel);
                    break;
                case 4:
                    System.out.println("Entrer la nouvelle puissance d'attaque : ");
                    int sAttackPower = sc.nextInt();
                    sc.nextLine();
                    listCharacter.get(charSelected - 1).setAttackPower(sAttackPower);
                    break;
                case 6:
                    System.out.println("Entrer votre nouveau moyen de défense (philtre(M) bouclier(G) : ");
                    String sDefense = sc.nextLine();
                    listCharacter.get(charSelected - 1).setDefense(sDefense);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("mauvais choix de caractéristique");
            }
        }
    }

    public void deleteCharacter(ArrayList<Character> listCharacter) {
        listCharacterName(listCharacter);
        System.out.println("Quelle personnage voulez-vous supprimer (entrer son numéro, 9 pour quitter) ?");
        Scanner sc = new Scanner(System.in);
        int charSelected = sc.nextInt();
        sc.nextLine();
        if (charSelected == 9) {
            Menu M = new Menu();
            M.displayCharacterMenu();
        } else {
            listCharacter.remove(charSelected-1);
        }
    }

    public void charNotCreated(){
        System.out.println("Commencez par créer un personnage");
    }
}
