package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {
    public static void main(String[] args) {
        Playable veena = new Veena();
        veena.play();
        Playable saxophone = new Saxophone();
        saxophone.play();
    }
}
