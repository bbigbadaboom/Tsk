package Test.BO.Letters;

public class LetterOne extends Letter {
    private static final String whom1 = "minor_97@mail.ru";
    private static final String theme2 = "Letter";
    private static final String body3 = "Hello max";

    public LetterOne(String whom, String theme, String body) {
        super(whom, theme, body);
    }

    public static Letter getLetter() {
        return new Letter(whom1, theme2, body3);
    }

}
