public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        if (instanceType.equals("ScienceFiction")) {
            instanceType = "Science Fiction";
        }
        switch (instanceType.charAt(0)) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' ->
                    System.out.println(title + " is an " + instanceType + " film");
            default -> System.out.println(title + " is a " + instanceType + " film");
        }
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}
