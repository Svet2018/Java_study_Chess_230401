package src.main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        BasePlayer whitePlayer = new BasePlayer("Ivanov", "ID_1", true, 100, 33);
//        BasePlayer blackPlayer = new BasePlayer("Petrov", "ID_2", false, 200, 43);
//        System.out.println(whitePlayer);
//        System.out.println();
//        System.out.println(blackPlayer);
//        System.out.println(whitePlayer.getNamePlayer());
//        whitePlayer.setWhite(false);
//        System.out.println(whitePlayer);
//        System.out.println(whitePlayer.getRankPlayer());
//        whitePlayer.setRankPlayer(2);
//        System.out.println(whitePlayer.getRankPlayer());
//        try {
//            whitePlayer.setRankPlayer(-1);
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("Please Update rank");
//        }
//
//        System.out.println(whitePlayer.getRankPlayer());

        Main main = new Main();
        List<BasePlayer> players = main.createPlayers();
        for (BasePlayer player : players){
            System.out.println(player + " ");
            System.out.println();
        }

        HashMap<Integer, BasePiece> pieces = main.createPieces();
        System.out.println(pieces);
        main.play(players, pieces);


//

    }

    public List<BasePlayer> createPlayers(){
        BasePlayer whitePlayer = new BasePlayer("Ivanov", "ID_1", true, 100, 33);
        BasePlayer blackPlayer = new BasePlayer("Petrov", "ID_2", false, 200, 43);
        List<BasePlayer> playersList = new ArrayList<>();
        playersList.add(whitePlayer);
        playersList.add(blackPlayer);
//        System.out.println(playersList);
        return playersList;
    }

    public HashMap<Integer, BasePiece> createPieces(){
        King whiteKing = new King(new Spot("h", 7), 1, true);
        King blackKing = new King(new Spot("d", 8), 2, false);
        Rook whiteRook_1 = new Rook(new Spot("a", 7),3, true);
        Rook whiteRook_2 = new Rook(new Spot("g", 7),4, true);
        Knight blackKnight_1 = new Knight(new Spot("d", 6), 5, false);
        HashMap<Integer, BasePiece> piecesHashMap = new HashMap<>();
        piecesHashMap.put(whiteKing.getId(), whiteKing);
        piecesHashMap.put(blackKing.getId(), blackKing);
        piecesHashMap.put(whiteRook_1.getId(), whiteRook_1);
        piecesHashMap.put(whiteRook_2.getId(), whiteRook_2);
        piecesHashMap.put(blackKnight_1.getId(), blackKnight_1);
        return piecesHashMap;
    }

    public void play(List<BasePlayer> players, HashMap<Integer, BasePiece> hashMap) {
        // move 1
        players.get(0).movePiece(hashMap.get(1), new Spot("a", 8));
        players.get(1).movePiece(hashMap.get(5), new Spot("c", 8));

    }


}
