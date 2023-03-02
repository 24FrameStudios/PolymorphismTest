public class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("\u2022 %s%n".repeat(4), "Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4");
    }
}
