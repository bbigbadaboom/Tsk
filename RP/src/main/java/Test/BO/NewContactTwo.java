package Test.BO;

public class NewContactTwo extends Contact {
    private static final String name = "Oleg";
    private static final String surname = "Korolkov";
    private static final String mail = "minor_97@mail.ru";

    public NewContactTwo(String name, String surname, String mail) {
        super(name, surname, mail);
    }

    public static String getName() {
        return name;
    }

    public static String getSurname() {
        return surname;
    }

    public static String getMail() {
        return mail;
    }
}
