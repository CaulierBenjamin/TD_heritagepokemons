public class Pokemon {
    protected String nom;
    protected int niveau_energie;
    protected double poids;

    public Pokemon(){
    }

    public Pokemon(String nom, int niveau_energie, double poids) {
        this.nom = nom;
        this.niveau_energie = niveau_energie;
        this.poids = poids;
    }
}
