package h25.msd.poo2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializationObject {

    public final static String FICHIER_OBJET = "personnes.obj";
    public final static String FICHIER_COLLECTION = "collection.obj";
    //TODO 13-1 rendez la classe Personne sérialisable. Faites en sorte que l'attribut tempdData ne soit pas sérialisé


    public void ecrireFichierObjet(Personne... personnes) {
        // TODO 13-1 Écrire dans le fichier personnes.obj tous les objets de type Personne reçus en paramètre.
        // Sérialisez chaque personne, une à la fois dans une boucle.

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FICHIER_OBJET);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);
            System.out.println("\nÉcriture des personnes");
            for (Personne personne : personnes) {
                oos.writeObject(personne);
            }
            //0u
            //oos.writeObject(new ArrayList<>(Arrays.asList(personnes)));// mais doit être lu différemment

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void lireFichierObjet() {
        // TODO 13-2 Lire le fichier personnes.obj que vous avez écrit au numéro précédant puis faites
        //  afficher chaque personnes en console

        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(FICHIER_OBJET);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);
            System.out.println("\nLecture des personnes");
            while (true) {
                Personne personne = (Personne) ois.readObject();
                System.out.println(personne);
            }
            // et pour lire la collection
//            ArrayList<PersonneSerializable> listRetrouvee = (ArrayList<PersonneSerializable>) ois.readObject();
        } catch (EOFException eof) {
            System.out.println("Lecture terminée");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void ecrireCollection(Personne... personnes) {
        // TODO 13-3 Écrire dans le fichier collection.obj tous les objets de type Personne reçus en paramètre.
        //  Serialisez le tableau de personnes d'un seul coups (sans utiliser de boucle)

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FICHIER_COLLECTION);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);
            System.out.println("\nÉcriture du tableau");
            oos.writeObject(personnes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void lireCollection() {
        // TODO 13-4 Lire le fichier collection.obj que vous avez écrit au numéro précédant puis faites
        //  afficher chaque personnes en console
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(FICHIER_COLLECTION);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);
            System.out.println("\nlecture du tableau");
            Personne[] personnesLues =  (Personne[])ois.readObject();
            for(Personne personne : personnesLues){
                System.out.println(personne);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
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
