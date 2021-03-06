package ch.heigvd.digitalpatate.monopoly;

public abstract class Square {

    private String name;
    private int index;

    public Square(String name, int index) {
        this.name = name;
        this.index=index;
    }

    public String getName() {
        return name;
    }
    public int getIndex(){return index;}

    public abstract void landedOn(Player p);

}
