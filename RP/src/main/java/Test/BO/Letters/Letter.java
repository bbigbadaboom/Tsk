package Test.BO.Letters;

//Factory example
public class Letter{
    private static String whom;
    private static String theme;
    private static String body;

    public Letter(String whom, String theme, String body) {
        this.whom = whom;
        this.theme = theme;
        this.body = body;
    }
    public static Letter getLetter() {
        return new Letter(whom, theme, body);
    }

    public String getWhom() {
        return whom;
    }

    public String getTheme() {
        return theme;
    }

    public String getBody() {
        return body;
    }
}
