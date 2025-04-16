package fichiersFormatif;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FichierTexte {


    // todo 9-2 Créez un dossier working et configurer votre application pour qu'elle l'utilise par défaut.
    // Modifiez les chemin d'accès de 8-1 et 8-3 en conséquence.

    public static final String BASE_PATH = "/Users/Martin/temp/";

    public static void main(String[] args) {
        ecrireFichierTexte(
                "J'aime le ping pong.",
                "Elle regarde la lune.",
                "Dessine-moi une grenouille!");
//        System.out.println(lireTexteBoucle());
//
//        lireFichierRessource();
    }

    public static void ecrireFichierTexte(String... phrases) {

        // todo 8-1 Écrivez les phrases reçues en paramètres dans un fichier texte nommé boucleTexte.txt.
        // Utiliser System.LineSeparator pour que votre fichier soit bien configuré sur votre plateforme.


    }


    public static Collection<String> lireTexteBoucle() {
        Collection<String> retPhrases = new ArrayList<>();

        //todo 8-2 Lire en boucle le fichier boucleTexte.txt produit par ecrireFichierTexte
        // Utilisez un FileReader. Utilise aussi un buffer pour être plus efficace.
        // Un fichier texte est terminé lorsque la méthode readLine retourne null.



        return null;
    }

    public static void lireFichierRessource() {
        // todo 11-1 Créez un dossier nommé ressource et configurer le dans IntelliJ pour qu'il soit sur le classpath (dans project structure).
        //  Créez également les sous-dossiers nécessaires pour que les fichiers de resources soient au même endroit que la classe FichierTexte.java
        //  dans le dossier fichiersFormatif.


        // todo 11-2 Ajoutez à la main un fichier bidon.txt qui contient des lignes de texte (mettez le texte que vous voulez)
        // dans le même package que le fichier FichierTexte.java. Lire ce fichier en utilisant le mécanisme de lecture de resource.


    }
}
