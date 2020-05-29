public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        int ageDiff = Math.abs(birth - yearTo);
        StringBuilder sb = new StringBuilder();
        sb.append("You ");
        if ((ageDiff == 0)) {
            sb.append("were born this very year!");
        } else {
            if ((ageDiff == 1 && birth > yearTo)) {
                sb.append("will be born in 1 year.");
            } else {
                if ((ageDiff == 1 && birth < yearTo)) {
                    sb.append("are 1 year old.");
                } else {
                    if ((ageDiff > 1 && birth > yearTo)) {
                        sb.append("will be born in ")
                                .append(ageDiff)
                                .append(" years.");
                    } else {
                        sb.append("are ").append(ageDiff).append(" years old.");
                    }
                }
            }
        }
        return sb.toString();
    }
}
