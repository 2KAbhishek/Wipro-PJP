class Author{
    String name;
    int age;
    char gender;

    Author(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Book{
    String name;
    Author auth;
    double price;
    int qtyInStock;

    Book(String name, Author auth, double price, int qtyInStock){
        this.name = name;
        this.auth = auth;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    void getDetails(){
        System.out.printf("Book Details %n Name : %s %n Price: %f %n Quantity In Stock: %d %n", this.name, this.price, this.qtyInStock);
        System.out.printf("Author Details %n Name : %s %n Age: %d %n Gender: %C %n", this.auth.name, this.auth.age, this.auth.gender);
    }

    public static void main(String[] args){
        Author auth = new Author ("No One", 25, 'M');
        Book book = new Book("Something", auth, 99.99, 100);
        book.getDetails();
    }
}
