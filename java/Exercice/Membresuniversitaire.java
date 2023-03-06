public class Membresuniversitaire {
    private int numero;
    private String prenom;
    private String nom;
    private int adressepostale;
    private String mail;

    public Membresuniversitaire (int numero, String prenom, String nom, int adressepostale, String mail ){
        this.numero = numero;
        this.prenom = prenom;
        this.nom = nom;
        this.adressepostale = adressepostale;
        this.mail = mail;
    }

    public int getnumero(){
        return numero;
    }

    public void setnumero(int numero){
        this.numero = numero;
    }

    public String getprenom(){
        return prenom;
    }

    public void setprenom(String prenom){
        this.prenom = prenom;
    }

    public String getnom(){
        return nom;
    }

    public void setnom(String nom){
        this.nom = nom;
    }

    public int getAdressepostale() {
        return adressepostale;
    }

    public void setAdressepostale(int adressepostale) {
        this.adressepostale = adressepostale;
    }
   
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
