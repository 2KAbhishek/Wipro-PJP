public class String10{
    public static void main(String[] args) {
        StringBuffer out = new StringBuffer("");
        int n = Integer.parseInt(args[1]);
        StringBuffer sbr = new StringBuffer(args[0]);
        sbr.delete(0, sbr.length() - 3);

        for (int i = 0; i < n; i++)
            out.append(sbr);

        System.out.println(out);
    }
}
