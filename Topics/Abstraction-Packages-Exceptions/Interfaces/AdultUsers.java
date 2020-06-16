public class AdultUsers implements LibraryUser {
    private int age;
    private String bookType;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age > 12)
            System.out.println("You have successfully registered under a Adult Account");

        if (age <= 12)
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");

    }

    @Override
    public void requestBook() {
        if (bookType.equals("Fiction"))
            System.out.println("Book Issued successfully, please return the book within 7 days");
        else
            System.out.println("Oops, you are allowed to take only adult Fiction books");

    }

}
