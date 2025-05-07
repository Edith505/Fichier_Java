package h25.msd.poo2;

public class Personne {


    public enum Titre {MONSIEUR, MADAME, MONSEIGNEUR}

    ;
    private Titre titre;
    private int age;
    private String nom;

    private int tempData;

    public Personne(Titre titre, int age, String nom) {
        this.titre = titre;
        this.age = age;
        this.nom = nom;
    }

    public Titre getTitre() {
        return titre;
    }

    public void setTitre(Titre titre) {
        this.titre = titre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        return nom != null ? nom.equals(personne.nom) : personne.nom == null;
    }

    @Override
    public int hashCode() {
        return nom != null ? nom.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "titre=" + titre +
                ", age=" + age +
                ", nom='" + nom + '\'' +
                '}';
    }
}
