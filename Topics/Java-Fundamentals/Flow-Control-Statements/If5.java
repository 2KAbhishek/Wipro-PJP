public class If5{
    public static void main(String[] args){
        char x = args[0].charAt(0);
        String out = "";
        if (Character.isLetter(x)){
            out = "Alphabet";
        }
        else if (Character.isDigit(x)){
            out = "Digit";
        }
        else{
            out = "Special Character";
        }
        System.out.println(out);
    }
}
