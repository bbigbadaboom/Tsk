package Test.BO;

public class NewContact extends Contact {
    private static final String name = "Max";
    private static final String surname = "Korolkov";
    private static final String mail = "kost_434@mail.ru";

    public NewContact(String name, String surname, String mail) {
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
