public class Main {
    public static void main(String[] args){
        Insecte Cheniselle = new Insecte("Cheniselle",100,0.05,4,2,0.25);
        Mer PloufPlouf = new Mer("PloufPlouf",100,42,2);
        Feu Dracofeu = new Feu("Dracofeu",100,12,2,10,172,3.50);
        System.out.println(Cheniselle.toString());
        System.out.println(PloufPlouf.toString());
        System.out.println(Dracofeu.toString());
        combat(Cheniselle,Dracofeu);

    }
    public static void combat( Pokemon prmPokemon,Pokemon prmPokemon1){
        System.out.println(prmPokemon.getEnergie() + " " +prmPokemon1.getEnergie());
        prmPokemon1.setEnergie(prmPokemon1.getEnergie() - prmPokemon.attaque());
        prmPokemon.setEnergie(prmPokemon.getEnergie() - prmPokemon1.attaque());
        System.out.println(prmPokemon.getEnergie() +" "+ prmPokemon1.getEnergie());
    }
}
