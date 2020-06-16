public class TestInstrument{
    public static void main(String[] args) {
        Instrument inst[] = new Instrument[10];
        for (int i = 0; i < inst.length; i++){

            if (i == 1 || i == 4 || i == 7 )
                inst[i] = new Piano();
            else if (i == 2 || i == 6 || i == 8)
                inst[i] = new Flute();
            else
                inst[i] = new Guitar();

            inst[i].play();

            if (inst[i] instanceof Piano)
                System.out.println("> Instance of Piano");
            else if (inst[i] instanceof Flute)
                System.out.println("> Instance of Flute");
            else
                System.out.println("> Instance of Guitar");
        }
    }
}
