public class String7{
    public static void main(String[] args) {
        String str = args[0];
        if (str.startsWith("x"))
            str = str.substring(1, str.length());
        if (str.endsWith("x"))
            str = str.substring(0, str.length() - 1);
        System.out.println(str);
    }
}
