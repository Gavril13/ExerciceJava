public class Personnel extends Membresuniversitaire {
    String mail1;
    public Personnel (String mail1, int numero, String prenom, String nom, int adressepostale, String mail){
        super(numero, prenom, nom, adressepostale, mail);
        this.mail1 = mail1;
    }
}
