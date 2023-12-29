import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        double averageReview = 0;
        double note = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Give your review to the movie");
            note = reading.nextDouble();
            averageReview = averageReview + note;
        }

        System.out.println("Average notes" + averageReview/3);
    }
}