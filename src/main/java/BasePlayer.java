package src.main.java;

import java.util.Scanner;

public class BasePlayer {
    private String namePlayer;
    private String idPlayer;
    private boolean white;
    private int rankPlayer;
    private int agePlayer;

    public BasePlayer(String namePlayer, String idPlayer, boolean white, int rankPlayer, int agePlayer) {
        if (namePlayer == null || namePlayer.isBlank() || namePlayer.isEmpty()){
            throw new IllegalArgumentException("The name of the player shoud not be empty");
        }else {
            this.namePlayer = namePlayer;
        }

        if (idPlayer == null || idPlayer.isBlank() || idPlayer.isEmpty()){
            throw new IllegalArgumentException("The ID of the player shoud not be empty");
        }else {
            this.idPlayer = idPlayer;
        }

        this.white = white;

        if (rankPlayer < 0 || rankPlayer > 3000){
            throw new IllegalArgumentException("The rank of the player out of the range");
        }else {
            this.rankPlayer = rankPlayer;
        }

        if (agePlayer < 18){
            throw new IllegalArgumentException("The player is too yang");
        }else if (agePlayer > 100){
            throw new IllegalArgumentException("The player is too old");
        } else {this.agePlayer = agePlayer;}

    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public String getIdPlayer() {
        return idPlayer;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public int getRankPlayer() {
        return rankPlayer;
    }

    public void setRankPlayer(int rankPlayer) {
        if (rankPlayer < 0 || rankPlayer > 3000){
            throw new IllegalArgumentException("Rank out of the range");
        }
        this.rankPlayer = rankPlayer;
        System.out.println("Rank of " + namePlayer + " was changed and = " + rankPlayer);

    }

    public int getAgePlayer() {
        return agePlayer;
    }

    public void setAgePlayer(int agePlayer) {
        this.agePlayer = agePlayer;
    }

    public void movePiece(BasePiece piece, Spot spot){
        piece.setSpot(spot);
        System.out.println("Piece " + piece.getName() + " is moved on the" + spot + " spot");
    }

    @Override
    public String toString() {
        return "Данные игрока: \n" +
                "Имя = " + namePlayer + ", \n" +
                "ID номер = " + idPlayer + ", \n" +
                "Белые фигуры = " + white + ", \n" +
                "Ранг игрока = " + rankPlayer + ", \n" +
                "Возраст игрока = " + agePlayer + ". \n";
    }
}
