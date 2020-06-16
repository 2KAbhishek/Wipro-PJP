public class TestBank{
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank();
        KotakBank k = new KotakBank();
        GeneralBank g = new ICICIBank();
        GeneralBank h = new KotakBank();
        System.out.printf("%s : %3.2f %n%s : %3.2f %n", "Savings", i.getSavingsInterestRate(), "Fixed Deposit", i.getFixedDepositInterestRate());
        System.out.printf("%s : %3.2f %n%s : %3.2f %n", "Savings", k.getSavingsInterestRate(), "Fixed Deposit", k.getFixedDepositInterestRate());
        System.out.printf("%s : %3.2f %n%s : %3.2f %n", "Savings", g.getSavingsInterestRate(), "Fixed Deposit", g.getFixedDepositInterestRate());
        System.out.printf("%s : %3.2f %n%s : %3.2f %n", "Savings", h.getSavingsInterestRate(), "Fixed Deposit", h.getFixedDepositInterestRate());
    }
}
