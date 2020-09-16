public class Mer extends Pokemon{
    private int nombre_nageoire;

    public Mer(){

    }

    public Mer(String nom, int niveau_energie, double poids, int nombre_nageoire) {
        super(nom, niveau_energie, poids);
        this.nombre_nageoire = nombre_nageoire;
    }
    public double vitesseeau(){
        double vitesse = (poids/25)*this.nombre_nageoire;
        return vitesse;
    }
    public double attaque(){
        double attaque = 10 * nombre_nageoire;
        return attaque;
    }
    public String toString(){
        return super.toString() + "mon nombre de nageoire "+this.nombre_nageoire;
    }
}
