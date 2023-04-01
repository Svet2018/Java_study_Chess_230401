package src.main.java;

public class BasePlayer {
    private String namePlayer;
    private String idPlayer;
    private boolean white;
    private int rankPlayer;
    private int agePlayer;

    public BasePlayer(String namePlayer, String idPlayer, boolean white, int rankPlayer, int agePlayer) {
        this.namePlayer = namePlayer;
        this.idPlayer = idPlayer;
        this.white = white;
        this.rankPlayer = rankPlayer;
        this.agePlayer = agePlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
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
        this.rankPlayer = rankPlayer;
    }

    public int getAgePlayer() {
        return agePlayer;
    }

    public void setAgePlayer(int agePlayer) {
        this.agePlayer = agePlayer;
    }
}
