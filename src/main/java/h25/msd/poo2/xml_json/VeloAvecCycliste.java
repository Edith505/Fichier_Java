package h25.msd.poo2.xml_json;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class VeloAvecCycliste extends Velo {

    private Cycliste cycliste;

    //TODO 9 commentez l'annotation pout que Jackson sauvegarde aussi le sacTransport.

    private SacTransport sacTransport;
    public VeloAvecCycliste(int nombreVitesse) {
        super(nombreVitesse);
    }

    @Override
    public String toString() {
        return "VeloAvecCycliste{" +
                "cycliste=" + cycliste +
                ", sacTransport=" + sacTransport +
                "} " + super.toString();
    }

// TODO 7 Rendre cet objet serializable en XML ou JSON

    public VeloAvecCycliste() {
        super();
    }


    //TODO 7 ajouter un cycliste au velo et aussi le velo à ce cycliste. C'est un lien bidirectionnel
    public void setCycliste(Cycliste cycliste) {
        this.cycliste = cycliste;
        cycliste.setVelo(this);
    }

    public Cycliste getCycliste() {
        return cycliste;
    }

    public SacTransport getSacTransport() {
        return sacTransport;
    }

    public void setSacTransport(SacTransport sacTransport) {
        this.sacTransport = sacTransport;
    }
}
