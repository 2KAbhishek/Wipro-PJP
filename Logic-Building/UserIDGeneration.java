import java.io.*;
import java.util.*;
public class UserIDGeneration {
    public String userIdGeneration(String input1,String input2,int input3,int input4){
        String firstName = input1,lastName = input2, longerName, smallerName;
        int pin = input3,N = input4;
        StringBuilder userId = new StringBuilder();

        if (firstName.length() > lastName.length()) {
            longerName = firstName;
            smallerName = lastName;
        } else if (firstName.length() < lastName.length())  {
            longerName = lastName;
            smallerName = firstName;
        } else {
            if (firstName.compareTo(lastName) < 1 ) {
                longerName = lastName;
                smallerName = firstName;
            } else {
                longerName = firstName;
                smallerName = lastName;
            }
        }

        userId.append(smallerName.charAt(smallerName.length() - 1));
        userId.append(longerName);
        for (int i = 0; i < userId.length(); i++) {
            if (Character.isUpperCase(userId.charAt(i)))
                userId.setCharAt(i, Character.toLowerCase(userId.charAt(i)));
            else
                userId.setCharAt(i, Character.toUpperCase(userId.charAt(i)));
        }
        userId.append(String.valueOf(pin).charAt(N - 1));
        userId.append(String.valueOf(pin).charAt(String.valueOf(pin).length() - N));

        return userId.toString();
    }
}
