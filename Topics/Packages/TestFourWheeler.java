import com.automobile.fourwheeler.*;

public class TestFourWheeler {
    public static void main(String[] args) {
        Logan logan = new Logan("Logan Car", "WB0001235", "Kabir Biswas", 185);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", logan.getModelName(), logan.getRegistrationNumber(), logan.getOwnerName(), logan.getSpeed());
		logan.gps();

		System.out.println();

		Ford ford = new Ford("Ford Car", "WB0007778", "Felu Mitra", 210);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", ford.getModelName(), ford.getRegistrationNumber(), ford.getOwnerName(), ford.getSpeed());
		ford.tempControl();
    }
}
