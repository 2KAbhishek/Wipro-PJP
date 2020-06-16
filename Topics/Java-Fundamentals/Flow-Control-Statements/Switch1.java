public class Switch1{
    public static void main(String[] args){
        char col = args[0].charAt(0);
        String out = "";
        switch(col){
            case 'R':
                out = "Red";
                break;
            case 'B':
                out = "Blue";
                break;
            case 'G':
                out = "Green";
                break;
            case 'O':
                out = "Orange";
                break;
            case 'Y':
                out = "Yellow";
                break;
            case 'W':
                out = "White";
                break;
            default:
                out = "Invalid Code";
        }
        System.out.println(out);
    }
}
