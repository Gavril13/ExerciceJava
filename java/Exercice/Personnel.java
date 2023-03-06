public class Personnel extends Membresuniversitaire {
    private String mail1;
    public Personnel (String mail1, int numero, String prenom, String nom, int adressepostale, String mail){
        super(numero, prenom, nom, adressepostale, mail);
        this.mail1 = mail1;
    }

    public String getMail1() {
        return mail1;
    }
    public void setMail1(String mail1) {
        this.mail1 = mail1;
    }
}
