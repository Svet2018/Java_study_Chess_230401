package src.main.java;

public class Main {
    public static void main(String[] args) {
        BasePlayer whitePlayer = new BasePlayer("Ivanov", "ID_1", true, 100, 23);
        BasePlayer blackPlayer = new BasePlayer("Petrov", "ID_2", false, 200, 43);
        System.out.println(whitePlayer);
    }
}
