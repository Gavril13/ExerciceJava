public class Enseignant_Chercheur extends Enseignant{
    String etablissement;
    public Enseignant_Chercheur(int numero, String prenom, String nom, int adressepostale, String mail, int service, int nbheure, String etablissement){
        super(numero, prenom, nom, adressepostale, mail);
        this.etablissement = etablissement;
    }
}
