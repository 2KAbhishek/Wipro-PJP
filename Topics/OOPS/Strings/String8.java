public class String8{
    public static void main(String[] args) {
        String str = args[0];
        int pos = str.indexOf("*");
        StringBuffer sbr = new StringBuffer(str);
        sbr.delete(pos -1, pos +2);
        System.out.println(sbr);
    }
}
