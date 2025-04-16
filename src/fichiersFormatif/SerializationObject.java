package fichiersFormatif;

import java.io.*;
import java.util.List;

public class SerializationObject {

    public final static String FICHIER_OBJET = "personnes.obj";
    public final static String FICHIER_COLLECTION = "collection.obj";

    //TODO 13-1 rendez la classe Personne sérialisable. Faites en sorte que l'attribut tempdData ne soit pas sérialisé

    public void ecrireFichierObjet(Personne... personnes) {
        // TODO 13-2 Écrire dans le fichier personnes.obj tous les objets de type Personne reçus en paramètre.
        // Sérialisez chaque personne, une à la fois dans une boucle.



    }

    public void lireFichierObjet() {
        // TODO 13-3 Lire le fichier personnes.obj que vous avez écrit au numéro précédant puis faites
        //  afficher chaque personnes en console


    }

    public void ecrireCollection(Personne... personnes) {
        // TODO 13-4 Écrire dans le fichier collection.obj tous les objets de type Personne reçus en paramètre.
        //  Serialisez le tableau de personnes d'un seul coups (sans utiliser de boucle)


    }

    public void lireCollection() {
        // TODO 13-5 Lire le fichier collection.obj que vous avez écrit au numéro précédant puis faites
        //  afficher chaque personnes en console

    }

    public static void main(String[] args) {
        SerializationObject so = new SerializationObject();
        so.ecrireFichierObjet(
                new Personne(Personne.Titre.MONSEIGNEUR, 76, "Paul"),
                new Personne(Personne.Titre.MADAME, 38, "Stephanie"),
                new Personne(Personne.Titre.MONSIEUR, 28, "Dave")
        );
//        so.lireFichierObjet();
//        so.ecrireCollection(
//                new PersonneSerializable(PersonneSerializable.Titre.MONSEIGNEUR, 76, "Paul"),
//                new PersonneSerializable(PersonneSerializable.Titre.MADAME, 38, "Stephanie"),
//                new PersonneSerializable(PersonneSerializable.Titre.MONSIEUR, 28, "Dave")
//        );
//        so.lireCollection();

    }

}
