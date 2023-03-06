public class Enseignant_Chercheur extends Enseignant{
    private String etablissement;

    public Enseignant_Chercheur(int numero, String prenom, String nom, int adressepostale, String mail, int serviceannuel, int decharge, int servicestatubase, int nbheure, String etablissement){
        super(numero, prenom, nom, adressepostale, mail, serviceannuel, decharge, servicestatubase, nbheure);
    }

    public String getEtablissement() {
        return etablissement;
    }
    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }
}
