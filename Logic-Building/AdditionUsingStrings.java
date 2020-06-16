import java.io.*;
import  java.util.*;
import java.math.BigDecimal;

class AdditionUsingStrings {
    public String additonUsingStrings(String input1,String input2){
        BigDecimal x = new BigDecimal(input1);
        BigDecimal y = new BigDecimal(input2);
        return String.valueOf(x.add(y));
    }
}
