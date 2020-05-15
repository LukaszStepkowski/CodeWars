public class Main {
    public static void main(String[] args) {
        System.out.println(getGrade(84, 79, 85));
    }

    public static char getGrade(int s1, int s2, int s3) {
        char grade = ' ';
        int avgScore = (s1 + s2 + s3) / 3;

        if (avgScore < 60){
            grade = 'F';
        } else if (avgScore < 70) {
            grade = 'D';
        } else if (avgScore < 80) {
            grade = 'C';
        } else if (avgScore < 90) {
            grade = 'B';
        } else grade = 'A';

        return grade;
    }
}
