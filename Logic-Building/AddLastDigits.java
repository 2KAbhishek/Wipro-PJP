public class AddLastDigits{
    public int addLastDigits(int input1, int input2){
        return Math.abs(input1 % 10) + Math.abs(input2 % 10);
    }
}
