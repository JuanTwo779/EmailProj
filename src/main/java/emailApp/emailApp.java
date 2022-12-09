package emailApp;

public class emailApp {
    public static void main(String[] args) {
        email em = new email("Jan", "Pan");

        em.setMailboxCapacity(1000);

        System.out.println(em.display());
    }

}
