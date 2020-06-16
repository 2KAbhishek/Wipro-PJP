public class String6{
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
        String out;

        if (str1.length() > str2.length())
            out = str2 + str1 + str2;
        else
            out = str1 + str2 + str1;

        System.out.println(out);

    }
}
