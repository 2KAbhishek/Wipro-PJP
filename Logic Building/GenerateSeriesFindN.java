public class GenerateSeriesFindN {
    public int generateSeriesFindN(int input1,int input2,int input3,int input4){
        int gap1 = (input2 - input1);
        int gap2 = (input3 - input2);
        int output = input1;

        for (int i = 1; i < input4; i++) {
            if (i % 2 == 1)
                output += gap1;
            else
                output += gap2;
        }
        return output;
    }
}
