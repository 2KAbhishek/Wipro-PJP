public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers kid = new KidUsers();
        AdultUsers adult = new AdultUsers();

        kid.setAge(10);
        kid.setBookType("Kids");
        kid.registerAccount();
        kid.requestBook();

        System.out.println();

        adult.setAge(22);
        adult.setBookType("Fiction");
        adult.registerAccount();
        adult.requestBook();

    }
}
