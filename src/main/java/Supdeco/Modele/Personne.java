package Supdeco.Modele;

public abstract class Personne {

    protected String nom;
    protected String prenom;
    protected String email;

    // Constructeur

    public Personne(String nom, String prenom , String email) {
        this.nom = nom;
        this.prenom=prenom;
        this.email = email;
    }

    public abstract String getRole();

    public void afficherInfos(){
        System.out.println("[" +getRole()+ "]" +nom+ " "+prenom+" "+"<" +email+ ">");
    }
}
