public class PinGenerator {
    public int pinGenerator(int input1, int input2, int input3) {
        int pin = 0;
        int ip1, ip2, ip3, min, max;

        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        min = Math.min(ip1, ip2);
        min = Math.min(min, ip3);
        max = Math.max(ip1, ip2);
        max = Math.max(max, ip3);
        pin = min;

        input1 /= 10;
        input2 /= 10;
        input3 /= 10;
        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        min = Math.min(ip1, ip2);
        min = Math.min(min, ip3);
        max = Math.max(max, ip1);
        max = Math.max(max, ip2);
        max = Math.max(max, ip3);
        pin = min * 10 + pin;

        input1 /= 10;
        input2 /= 10;
        input3 /= 10;
        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        min = Math.min(ip1, ip2);
        min = Math.min(min, ip3);
        max = Math.max(max, ip1);
        max = Math.max(max, ip2);
        max = Math.max(max, ip3);
        pin = min * 100 + pin;
        pin = max * 1000 + pin;

        return pin;
    }
}
