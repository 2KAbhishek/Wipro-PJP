public class String11{
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
        int len = str2.length();
        StringBuffer sbr = new StringBuffer();

        int leftIndex = str1.indexOf(str2);
        if (leftIndex != 0)
            sbr.append(str1.charAt(leftIndex -1));
        if (leftIndex + len < str1.length())
            sbr.append(str1.charAt(leftIndex + len));

        int rightIndex = str1.lastIndexOf(str2);
        if (rightIndex != 0)
            sbr.append(str1.charAt(rightIndex -1));
        if (rightIndex + len < str1.length())
            sbr.append(str1.charAt(rightIndex + len));

        System.out.println(sbr);
    }
}
