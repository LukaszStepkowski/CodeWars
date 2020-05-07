public class Main {
    public static void main(String[] args) {

    }

    public static int points(String[] games) {

        int totalPoints = 0;
        String[] tempArray;
        int ourTeam = 0;
        int opponentTeam = 0;

        for (int i = 0; i < games.length; i++){
            tempArray = games[i].split(":");
            ourTeam = Integer.valueOf(tempArray[0]);
            opponentTeam = Integer.valueOf(tempArray[1]);
            if (ourTeam > opponentTeam){
                totalPoints += 3;
            }
            if (ourTeam == opponentTeam){
                totalPoints++;
            }
        }

        return totalPoints;
    }
}
