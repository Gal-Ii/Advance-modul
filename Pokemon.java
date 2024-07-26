package f06_Defining_Classes.Google;

public class Pokemon {
    private String pokemonName;
    private String type;

    public Pokemon(String pokemonName, String type){
        this.pokemonName = pokemonName;
        this.type = type;
    }

    public String toString(){
        return String.format("%s %s", this.pokemonName, this.type);
    }

}
