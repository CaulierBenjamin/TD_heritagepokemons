public class Addict extends Pokemon{
    private int nombre_pattes;
    private int niveau_jeu;
    private int nombre_heures;
    private double taille;

    public Addict(){

    }

    public Addict(String nom, int niveau_energie, double poids, int nombre_pattes, int niveau_jeu, int nombre_heures, double taille) {
        super(nom, niveau_energie, poids);
        this.nombre_pattes = nombre_pattes;
        this.niveau_jeu = niveau_jeu;
        this.nombre_heures = nombre_heures;
        this.taille = taille;
    }
    public double vitessesol(){
        double vitesse = this.nombre_pattes * this.taille * 3;
        return vitesse;
    }
    public double attaque(){
        double attaque = 2 * vitessesol();
        return  attaque;
    }
    public String toString(){
        return super.toString() + "mon nombre de pattes est : "+this.nombre_pattes+ " mon niveau de jeu : "+this.niveau_jeu + " nombre dheure "+ this.nombre_heures+" ma taille est " +this.taille;
    }
}
