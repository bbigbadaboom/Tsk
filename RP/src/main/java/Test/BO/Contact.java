package Test.BO;

public class Contact {
    private static String name;
    private static String surname;
    private static String mail;

    public Contact(String name, String surname, String mail) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
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
