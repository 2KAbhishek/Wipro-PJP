import com.automobile.twowheeler.*;

public class TestTwoWheeler {
    public static void main(String[] args) {
        Hero hero = new Hero("Glamour 125", "WB0001234", "Kabir Biswas", 85);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", hero.getModelName(), hero.getRegistrationNumber(), hero.getOwnerName(), hero.getSpeed());
		hero.radio();

		System.out.println();

		Honda honda = new Honda("Honda Bike", "WB0007777", "Felu Mitra", 110);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", honda.getModelName(), honda.getRegistrationNumber(), honda.getOwnerName(), honda.getSpeed());
		honda.cdplayer();
    }
}
