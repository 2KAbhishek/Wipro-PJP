public class While3{
    public static void main(String[] args){
        int i = 1, count = 0;
        while (i <= 1000){
            if (i % 30 == 0){
                System.out.println(i);
                count += 1;
            }
            if (count == 5)
                break;
            i++;
        }
    }
}
