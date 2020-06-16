public class If2{
    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        String out = "";
        out = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(out);
    }
}
