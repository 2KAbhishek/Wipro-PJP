import java.util.Random;

public class TestCompartment{
    public static void main(String[] args) {
        Compartment cmps[] = new Compartment[10];
        Random rand = new Random();
        for (int i = 0; i < cmps.length; i++){
            int randNum = rand.nextInt(4) + 1;
            switch (randNum){
                case 1:
                    cmps[i] = new FirstClass();
                    break;
                case 2:
                    cmps[i] = new Ladies();
                    break;
                case 3:
                    cmps[i] = new General();
                    break;
                case 4:
                    cmps[i] = new Luggage();
                    break;
            }
            System.out.println(cmps[i].notice());
        }
    }
}
