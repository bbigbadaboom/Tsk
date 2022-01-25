package Test.BO.Letters;

public class LetterTwo extends Letter {
    private static final String whom1 = "kost_343@mail.ru";
    private static final String theme2 = "lets do it";
    private static final String body3 = "bla bla bla";

    public LetterTwo(String whom, String theme, String body) {
        super(whom, theme, body);
    }

    public static Letter getLetter() {
        return new Letter(whom1, theme2, body3);
    }

}