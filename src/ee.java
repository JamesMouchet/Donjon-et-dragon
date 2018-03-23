import java.util.Scanner;

public class Dongeon_et_Java {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Object test;
        String test2;
        do {
            String classe;
            do {
                System.out.println("Veuillez saisir une classe Guerrier ou Magicien");
                classe = sc.nextLine();
            } while(!(classe.toUpperCase().equals("GUERRIER")) || classe.toUpperCase().equals("MAGICIEN"));

            if (classe.toUpperCase().equals("GUERRIER")) {
                System.out.println("Veuillez saisir un nom pour votre guerrier");
                String nom = sc.nextLine();
                int level = -1;
                do {
                    System.out.println("Veuillez saisir un niveau pour votre guerrier entre 1 et 100");
                    String input = sc.nextLine();
                    try {
                        level = Integer.parseInt(input);
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.printf("\"%s\" n'est pas valide.\n", input);
                    }
                } while (level > 100 || level < 0);


                System.out.println("Veuillez saisir une image");
                String img = sc.nextLine();
                int atLevel = -1;
                do {
                    System.out.println("Veuillez saisir un niveau d'attaque pour votre guerrier");
                    String input = sc.nextLine();
                    try {
                        atLevel = Integer.parseInt(input);
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.printf("\"%s\" n'est pas valide.\n", input);
                    }
                } while (atLevel < 0);
                System.out.println("Veuillez donner un nom pour votre arme");
                String arme = sc.nextLine();
                System.out.println("Donnez un nom à votre bouclier");
                String bouclier = sc.nextLine();

            } else if (classe.toUpperCase().equals("MAGICIEN")) {
                System.out.println("Veuillez saisir un nom pour votre magicien");
                String nom = sc.nextLine();
                int level = -1;
                do {
                    System.out.println("Veuillez saisir un niveau pour votre magicien entre 1 et 100");
                    String input = sc.nextLine();
                    try {
                        level = Integer.parseInt(input);
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.printf("\"%s\" n'est pas valide.\n", input);
                    }
                } while (level > 100 || level < 0);


                System.out.println("Veuillez saisir une image");
                String img = sc.nextLine();
                int atLevel = -1;
                do {
                    System.out.println("Veuillez saisir un niveau d'attaque pour votre magicien");
                    String input = sc.nextLine();
                    try {
                        atLevel = Integer.parseInt(input);
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.printf("\"%s\" n'est pas valide.\n", input);
                    }
                } while (atLevel < 0);
                System.out.println("Veuillez donner un nom pour votre sort");
                String arme = sc.nextLine();
                System.out.println("Donnez un nom à votre philtre");
                String bouclier = sc.nextLine();
            }
            System.out.println("Voulez vous arrêter ? répondez non pour continuer, autre chose pour arrêter");
            test2 = sc.nextLine();
        } while(test2.toUpperCase().equals("NON"));
    }

}
