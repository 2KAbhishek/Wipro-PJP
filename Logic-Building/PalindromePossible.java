import java.util.*;
public class PalindromePossible {
    public int palindromePossible(int input1){
    String str = String.valueOf(input1);

    int count[] = new int[256];
    Arrays.fill(count, 0);

    for (int i = 0; i < str.length(); i++)
        count[(int)(str.charAt(i))]++;

    int odd = 0;
    for (int i = 0; i < 256; i++){
        if ((count[i] & 1) == 1) odd++;
        if (odd > 1) return 1;
    }
    return 2;
    }
}

