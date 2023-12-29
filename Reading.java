import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Type your favorite movie");
        String movie = reading.nextLine();
        System.out.println("When is the year of release?");
        int releaseYear = reading.nextInt();
        System.out.println("Give your review to the movie");
        double review = reading.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(review);
    }

}