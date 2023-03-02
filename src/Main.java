import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("\nEnter the type of movie you'd like to watch: \n");

            System.out.printf("%s%n".repeat(4), "A for Adventure", "C for Comedy", "S for Science Fiction", "Q for Quit");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }

            System.out.println("Enter the movie title you'd like to watch: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
