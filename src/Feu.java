public class Feu extends Pokemon{
    private int nombre_aile;
    private double nombre_boule_feu;
    private double temperature_feu;
    private double taille;

    public Feu(){

    }

    public Feu(String nom, int niveau_energie, double poids, int nombre_aile, double nombre_boule_feu, double temperature_feu, double taille) {
        super(nom, niveau_energie, poids);
        this.nombre_aile = nombre_aile;
        this.nombre_boule_feu = nombre_boule_feu;
        this.temperature_feu = temperature_feu;
        this.taille = taille;
    }
    public double vitesseair(){
        double vitesse = this.nombre_aile * this.taille * 10;
        return vitesse;
    }
    public double attaque(){
        double attaque = 15 * vitesseair();
        return  attaque;
    }
}
