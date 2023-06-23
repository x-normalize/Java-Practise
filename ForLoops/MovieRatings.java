package ForLoops;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movieCount = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        double average = 0;
        double totalRatings = 0;
        String maxFilm = "";
        String minFilm = "";

        for (int i = 1; i <= movieCount ; i++) {
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());

            if (movieRating > maxRating) {
                maxRating = movieRating;
                maxFilm = movieName;
            }
            if (movieRating < minRating) {
                minRating = movieRating;
                minFilm = movieName;
            }

            totalRatings += movieRating;
            average = totalRatings / movieCount;


        }

        System.out.printf("%s is with highest rating: %.1f\n", maxFilm, maxRating);
        System.out.printf("%s is with lowest rating: %.1f\n", minFilm, minRating);
        System.out.printf("Average rating: %.1f", average);

    }
}
