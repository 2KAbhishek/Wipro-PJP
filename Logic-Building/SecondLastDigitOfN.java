public class SecondLastDigitOfN{
    public int secondLastDigitOfN(int input1){
        if (input1 > 9 || input1 < -9){
            input1 /= 10;
            return Math.abs(input1 % 10);
        }
        else return -1;
    }
}
