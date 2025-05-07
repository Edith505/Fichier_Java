package h25.msd.poo2.xml_json;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Cycliste {
    private String nom = "Cymon";

    private Velo velo;

    public Cycliste(String nom) {
        this.nom = nom;
    }

    public Cycliste() {
    }

    //todo 7 Faite le nécessaire pour que le cycliste et le velo puisse etre sérialiser Json ou XML
    //sans boucle infinie.
    public void setVelo(Velo velo) {
        this.velo = velo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Cycliste{" +
                "nom='" + nom + '\'' +
                "} " + super.toString();
    }
}
