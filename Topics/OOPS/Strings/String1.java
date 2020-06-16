public class String1{
    public static void main(String[] args){
        String str = args[0];
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        String revStr = sbr.toString();

        if (str.equals(revStr))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
