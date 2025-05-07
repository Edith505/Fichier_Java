package h25.msd.poo2.xml_json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;



public class XMLOuJson {


    public static void main(String[] args) {
        XMLOuJson xmLOuJson = new XMLOuJson();
        Velo velo = new Velo();

        // TODO 13-2 mettre le velo dans une chaine de cactères XML et la faire afficher dans la console


        // TODO 13-3 Faire la même chose que 1 mais avec en format Json


        //TODO 13-4 utiliser la méthode convertitEn pour convertir l'objet velo en XML ou en JSON en fonction de la valeur de isXML


        //TODO 13-5 Écrire le velo dans le fichier velo.xml dans le dossier de travail


        //TODO 13-6 Lire le fichier velo.xml et afficher le contenu dans la console


        //TODO 13-8 Écrire en format Json un velo avec un cycliste dessus et le relire immédiatement
        // le velo ne doit pas avoir de sac de transport.


        //TODO 13-10 Écrire en format Json un velo avec un cycliste dessus et le relire immédiatement
        // le velo  doit  avoir un sac de transport et son contenu doit être mis sur le disuqe.

    }


    private String convertitEn(boolean isXML, Object objet) throws JsonProcessingException {
        // TODO 13-4
        // Petit defi : essayez de le faire en une seule ligne



        return null;
    }

}
