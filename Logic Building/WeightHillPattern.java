public class WeightHillPattern {
    public int weightHillPattern(int input1, int input2, int input3) {
        int totalWeight = 0;
        int initWeight = input2;

        for (int i = 0; i < input1; i++) {
            for (int j = 0; j <= i; j++) {
                totalWeight += initWeight;
            }
            initWeight += input3;
        }
        return totalWeight;
    }
}
