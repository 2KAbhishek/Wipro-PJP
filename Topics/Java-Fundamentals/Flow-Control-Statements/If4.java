import java.util.Arrays;

public class If4{
    public static void main(String[] args){
        Arrays.sort(args);
        for(int i = 0; i < args.length; i++){
            System.out.print(args[i]);
            if (i != args.length - 1){
                System.out.print(",");
            }
        }
    }
}
