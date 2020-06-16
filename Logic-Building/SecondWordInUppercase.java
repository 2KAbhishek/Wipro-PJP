public class SecondWordInUppercase {
    public String secondWordInUppercase(String input1) {
        if (input1.equals("")) return "LESS";
        StringBuffer sb = new StringBuffer(input1.trim());

        try {
            int startIndex = sb.indexOf(" ");
            if (startIndex == -1) return "LESS";
            try {
                int endIndex = sb.indexOf(" ", startIndex+1) + 1;
                return sb.substring(startIndex+1, endIndex).toUpperCase().trim();
            } catch (StringIndexOutOfBoundsException e) {
                return sb.substring(startIndex+1).toUpperCase().trim();
            }
        } catch (StringIndexOutOfBoundsException e) {
            return "LESS";
        }
    }
}
