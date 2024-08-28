package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Heera Rose", "Benet");
        em1.setAlternateEmail("heerarose@gmail.com");
        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
}

