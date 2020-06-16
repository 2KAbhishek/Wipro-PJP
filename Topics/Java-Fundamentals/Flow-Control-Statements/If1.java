public class If1{
    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        String out = "";
        if (n == 0){
            out = "Zero";
        }
        else if (n > 0){
            out = "Positive";
        }
        else{
            out = "Negative";
        }
        System.out.println(out);
    }
}
