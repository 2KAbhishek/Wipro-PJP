public class CountEvensOdds{
    public int countEvensOdds(int input1, int input2, int input3, int input4, int input5, String input6){
        int count = 0;
        int [] arr = {input1, input2, input3, input4, input5};
        for (int num : arr){
            if (num % 2 == 0) count++;
        }

        if (input6.equals("even")) return count;
        else return 5- count;
    }
}
