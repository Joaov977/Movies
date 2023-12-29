public class Conditional {
    public static void main(String[] args) {

        int releaseYear = 1986;
        boolean includedInThePlan = true;
        double noteMovie = 8.1;
        String planType = "plus";

        if (releaseYear > 2022) {
            System.out.println("Launch that customers are enjoying!");
        } else {
            System.out.println("Retro film worth watching!");
        }

        if (includedInThePlan == true && planType.equals("plus")) {
            System.out.println("Movie released!");
        } else {
            System.out.println("You must pay the rent");
        }

    }
}
