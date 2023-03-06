public class Enseignant extends Membresuniversitaire{
    private int serviceannuel; // service = servicestatubase - décharge
    private int decharge; // décharge = nombre d'heure que on a enlever sur celui de base
    private int servicestatubase = 384;
    private int nbheure;
    public Enseignant (int numero, String prenom, String nom, int adressepostale, String mail, int serviceannuel, int decharge, int servicestatubase, int nbheure){
        super(numero, prenom, nom, adressepostale, mail);
        this.serviceannuel = servicestatubase - decharge;
    }

    public int getServiceannuel() {
        return serviceannuel;
    }
    public void setService(int serviceannuel) {
        this.serviceannuel = serviceannuel;
    }

    public int getDecharge() {
        return decharge;
    }

    public void setDecharge(int decharge) {
        this.decharge = decharge;
    }

    public int getServicestatubase() {
        return servicestatubase;
    }

    public void setServicestatubase(int servicestatubase) {
        this.servicestatubase = servicestatubase;
    }

    public int getNbheure() {
        return nbheure;
    }

    public void setNbheure(int nbheure) {
        this.nbheure = nbheure;
    }


}
