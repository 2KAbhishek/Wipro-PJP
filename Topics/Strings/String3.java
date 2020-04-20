public class String3{
    public static void main(String[] args) {
        StringBuffer out = new StringBuffer("");
        int length = args[0].length();
        StringBuffer sbr = new StringBuffer(args[0]);
        sbr.delete(2, length);

        for (int i = 0; i < length; i++)
            out.append(sbr);

        System.out.println(out);
    }
}
