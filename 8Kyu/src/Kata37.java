public class Kata37 {
    public static String duckDuckGoose(Player[] players, int goose) {
        int modulo = goose % players.length;
        return (modulo != 0) ? players[modulo - 1].name : players[players.length - 1].name;
    }
}

class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }
}
