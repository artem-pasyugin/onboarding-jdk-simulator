public class TextBlocks {

    public static void main(String[] args) {
        String query = """
                INSERT INTO Students(grade, name)
                Values(%d, '%s')""".formatted(1, "Петров Петр Петрович");

        System.out.println(query);
    }
}