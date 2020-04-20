class Fruit{
    String name = "Fruit";
    String taste = "Bland";
    String size = "Medium";

    void eat(){
        System.out.println(this.name + " tastes bland.");
    }
}

class Apple extends Fruit{
    String name = "Apple";

    void eat(){
        System.out.println(this.name + " tastes sweet.");
    }
}

class Orange extends Fruit{
    String name = "Orange";

    void eat(){
        System.out.println(this.name + " tastes sour.");
    }
}

class TestFruit{
    public static void main(String[] args){
        Fruit fr = new Fruit();
        fr.eat();
        Apple ap = new Apple();
        ap.eat();
        Orange or = new Orange();
        or.eat();
    }
}
