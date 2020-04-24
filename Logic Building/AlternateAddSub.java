public class AlternateAddSub {
    public int AddSub(int input1,int input2){
        int result = input1;
        int check = 0;

        if (input2 == 1) check = 1;

        for (int i = input1 - 1, j = 0; i >= 1; i--, j++) {
            if (j % 2 == check) result += i;
            else result -= i;
        }
        return result;
    }
}
