public class Insecte extends Pokemon{
    private int nombre_pattes;
    private int nombre_ailes;
    private double taille;

    public Insecte(){

    }
    public Insecte(String nom, int niveau_energie, double poids, int nombre_pattes, int nombre_ailes, double taille) {
        super(nom, niveau_energie, poids);
        this.nombre_pattes = nombre_pattes;
        this.nombre_ailes = nombre_ailes;
        this.taille = taille;
    }
    public double vitessesol(){
        double vitesse = this.nombre_pattes * this.taille * 3;
        return vitesse;
    }
    public double vitesseair(){
        double vitesse = this.nombre_ailes * this.taille * 10;
        return vitesse;
    }
    public double attaque(){
        double attaque = vitesseair()*3;
        return  attaque;
    }
    public String toString(){
        return super.toString() + "mon nombre de pattes est : "+this.nombre_pattes+ " mon nomvbre d'ailes : "+this.nombre_ailes + " ma taille est " +this.taille;
    }
}
