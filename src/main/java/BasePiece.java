package src.main.java;

public abstract class BasePiece {
    private String name;
    private Spot spot;
    private int id;
    private boolean white;
    private boolean killed;

    public BasePiece(String name, Spot spot, int id, boolean white) {
        this.name = name;
        this.spot = spot;
        this.id = id;
        this.white = white;
    }

    public String getName() {
        return name;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public int getId() {
        return id;
    }

    public boolean isWhite() {
        return white;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    @Override
    public String toString() {
        return "Имя фигуры: " + name + ", \n" +
                "Расположение на доске: " + spot + ", \n" +
                "ID: " + id + ", \n" +
                "Белый: " + white + ", \n" +
                "Съедена: " + killed + ". \n";
    }
}
