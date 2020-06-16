public class String9{
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
        StringBuffer sbr = new StringBuffer();

        for(int i = 0; i < str1.length() || i < str2.length(); i++){

            if (i < str1.length())
                sbr.append(str1.charAt(i));

            if (i < str2.length())
                sbr.append(str2.charAt(i));
        }

        System.out.println(sbr);
    }
}
