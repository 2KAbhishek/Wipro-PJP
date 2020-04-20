public class String2{
    public static void main(String[] args){
        String str1 = args[0];
        String str2 = args[1];
        String outStr;
        char firstSec = str2.charAt(0);
        if (str1.endsWith(Character.toString(firstSec).toLowerCase())){
            StringBuffer sbr = new StringBuffer(str2);
            sbr.deleteCharAt(0);
            str2 = sbr.toString();
            outStr = str1 + str2;
        }
        else {
            outStr = str1 + " " + str2;
        }
        System.out.println(outStr.toLowerCase());
    }
}
