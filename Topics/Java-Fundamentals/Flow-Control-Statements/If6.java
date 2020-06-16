public class If6{
    public static void main(String[] args){
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        double per = 0.0;
        if (gender.equals("Female")){
            if (age >= 1 && age <= 58){
                per = 8.2;
            }
            else if (age <= 100){
                per = 9.2;
            }
        }
        if (gender.equals("Male")){
            if (age >= 1 && age <= 58){
                per = 8.4;
            }
            else if (age <= 100){
                per = 10.5;
            }
        }
        System.out.println(per + "%");
    }
}
