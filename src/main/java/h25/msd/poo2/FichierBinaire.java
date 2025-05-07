package h25.msd.poo2;

import h25.msd.poo2.Personne;
import h25.msd.poo2.Personne.Titre;

import java.io.*;
import java.util.*;

public class FichierBinaire {

    public static final String BASE_PATH = "./";

    public static void main(String[] args) {

        ecrireInfoDiverseBinaire();
        ecrireInfoDiverseBinaire2();
        lireAfficherInfoDiverseBinaire();

        comparerBufferOutput();

        ecrireBinaireBoucle(new Personne(Titre.MADAME, 67, "Pierrette"),
                new Personne(Titre.MONSEIGNEUR, 74, "George"),
                new Personne(Titre.MONSEIGNEUR, 94, "Ambrius"));
        System.out.println(lireBinaireBoucle());

        ajouterAuFichier("Bonjour");
        ajouterAuFichier(" Monde!");

    }


    private static void ecrireInfoDiverseBinaire() {
        // todo 5-1 on doit écrire les informations suivantes dans le fichier bidon.txt:
        //  int ->votre nombre favori;
        //  utf ->votre nom;
        //  double ->un nombre aléatoire

    }


    private static void ecrireInfoDiverseBinaire2() {
        // todo 5-1 on doit écrire les informations suivantes dans le fichier bidon.txt:
        //  int ->votre nombre favori; utf ->votre nom; double ->un nombre aléatoire

    }

    private static void lireAfficherInfoDiverseBinaire() {
        // todo 5-2 on doit lire les informations écrites avec ecrireInfoDiverseBinaire et les afficher en console

    }

    private static void comparerBufferOutput() {
        // todo 7-1 Comparer avec et sans buffer, ça vaut le coup d'essayer!

    }

    private static void ecrireBinaireBoucle(Personne... personnes) {
        //todo 6-1 Écrire une boucle qui enregistre toutes les personnes reçues en paramètre dans un fichier.
        // Notez qu'un enum peut être converti en texte facilement avec la méthode toString.

    }

    private static List<Personne> lireBinaireBoucle() {
        List<Personne> retListe = new ArrayList<>();
        // todo 6-2 Lisez le fichier binaire écrit en 6-1
        //  Si une information se répète un nombre indéterminé de fois, comment savoir quand arrêter de lire les données ?
        // Attrapez l'exception de fin de fichier pour déterminer la fin de l'exécution.


        return null;

    }

    public static void ajouterAuFichier(String texteAjoute) {
        //todo 10-1 ajoutez le texte recu en paramètre au fichier "ajout.bin".
        // Pour y arriver, utilisez le constructeur approprié pour le FileOutputStream.



    }

    //todo 9-1 Créez et configurer un dossier working dans le projet (à côté de src) et changez la constante BASE_PATH pour pointer sur votre nouveau working  c'est-à-dire -> "".
    // Réessayez maintenant les autres numéros pour voir si les fichiers sont bien produit dans le dossier working


}
