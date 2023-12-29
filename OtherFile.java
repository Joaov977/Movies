import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        double averageReview = 0;
        double note = 0;
        int totalNotes = 0;

        while (note != -1) {
            System.out.println("Give your review to the movie or -1 to end");
            note = reading.nextDouble();

            if (note != -1) {
                averageReview = averageReview + note;
                totalNotes++;
            }

            System.out.println("Average notes: " + averageReview / totalNotes);
        }
    }
}