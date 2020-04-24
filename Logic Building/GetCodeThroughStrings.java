import java.io.*;
import  java.util.*;

class GetCodeThroughStrings {
    public int getCodeThroughStrings(String input1){
        String[] words = input1.split(" ");
        int pin = 0;

        for(String word : words) {
            pin += word.length();
        }
        if (String.valueOf(pin).length() == 1) return pin;

        int pin2 = 0;
        String pinStr = String.valueOf(pin);
        for (int i = 0; i < pinStr.length(); i++) {
            pin2 += Integer.parseInt(String.valueOf(pinStr.charAt(i)));
        }

        return pin2;
    }
}
