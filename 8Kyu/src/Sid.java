public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        int lastPetalChosen = nb_petals % 6;
        return (lastPetalChosen == 1) ? "I love you"
                : (lastPetalChosen == 2) ? "a little"
                : (lastPetalChosen == 3) ? "a lot"
                : (lastPetalChosen == 4) ? "passionately"
                : (lastPetalChosen == 5) ? "madly" : "not at all";
    }
}
