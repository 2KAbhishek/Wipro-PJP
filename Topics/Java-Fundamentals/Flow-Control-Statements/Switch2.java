public class Switch2{
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("Please enter the month in numbers");
            System.exit(0);
        }
        int mon = Integer.parseInt(args[0]);
        String out = "";
        switch(mon){
            case 1:
                out = "January";
                break;
            case 2:
                out = "February";
                break;
            case 3:
                out = "March";
                break;
            case 4:
                out = "April";
                break;
            case 5:
                out = "May";
                break;
            case 6:
                out = "June";
                break;
            case 7:
                out = "July";
                break;
            case 8:
                out = "August";
                break;
            case 9:
                out = "September";
                break;
            case 10:
                out = "October";
                break;
            case 11:
                out = "November";
                break;
            case 12:
                out = "December";
                break;
            default:
                out = "Invalid month";
        }
        System.out.println(out);
    }
}
