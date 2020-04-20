class Animal{
    void eat(){
        System.out.println("Animal eats.");
    }
    void sleep(){
        System.out.println("Animal sleeps.");
    }
}

class Bird extends Animal{

    void eat(){
        System.out.println("Bird eats.");
    }
    void sleep(){
        System.out.println("Bird sleeps.");
    }
    void fly(){
        System.out.println("Bird flies.");
    }

    public static void main(String[] args){
        Animal ani = new Animal();
        ani.eat();
        ani.sleep();
        Bird bi = new Bird();
        bi.eat();
        bi.sleep();
        bi.fly();
    }
}
