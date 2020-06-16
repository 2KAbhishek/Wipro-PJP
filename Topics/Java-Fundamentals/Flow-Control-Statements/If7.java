public class If7{
    public static void main(String[] args){
        char x = args[0].charAt(0);
        if (Character.isLowerCase(x)){
            System.out.println(x + "->" + Character.toUpperCase(x));
            System.exit(0);
        }
        else if (Character.isUpperCase(x)){
            System.out.println(x + "->" + Character.toLowerCase(x));
            System.exit(0);
        }
    }
}
