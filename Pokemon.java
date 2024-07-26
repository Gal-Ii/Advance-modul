package f06_Defining_Classes.Pokemon_Trainer;

public class Pokemon {
//name, an element, and health

    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health){
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement(){
        return this.element;
    }

    public int getHealth(){
        return this.health;
    }
    public void loseHealth(){
        this.health -= 10;
    }
}
