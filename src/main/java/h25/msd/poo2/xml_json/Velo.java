package h25.msd.poo2.xml_json;

import java.util.UUID;

public class Velo {
    private int nombreVitesse;
    private String numSerie;

    public Velo(int nombreVitesse) {
        this();
        this.nombreVitesse = nombreVitesse;
    }

    @Override
    public String toString() {
        return "Velo{" +
                "nombreVitesse=" + nombreVitesse +
                ", numSerie='" + numSerie + '\'' +
                '}';
    }

    // TODO 13-1 Rendre cet objet serializable en XML ou JSON
    public Velo() {
        this.numSerie = UUID.randomUUID().toString();
    }

    public int getNombreVitesse() {
        return nombreVitesse;
    }

    public void setNombreVitesse(int nombreVitesse) {
        this.nombreVitesse = nombreVitesse;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String dumSerie) {
        this.numSerie = dumSerie;
    }


}
