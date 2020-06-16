import java.io.*;
import java.util.*;
public class MsgControlledRobot {
    public String moveRobot(int input1,int input2,String input3,String input4){
        int X = input1, Y = input2;
        String currentPos = input3, msg = input4;
 
        int currX = Integer.parseInt(currentPos.split("-")[0]);
        int currY = Integer.parseInt(currentPos.split("-")[1]);
        String currD = currentPos.split("-")[2];
        String[] instructions = msg.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < instructions.length; i++) {
            if (instructions[i].equals("M")) {
                if (currD.equals("E") && (currX + 1 > X )) {
                    output.append("-ER");
                    break;
                }
                if (currD.equals("W") && (currX - 1 < 0 )) {
                    output.append("-ER");
                    break;
                }
                if (currD.equals("N") && (currY + 1 > Y )) {
                    output.append("-ER");
                    break;
                }
                if (currD.equals("S") && (currY - 1 < 0 )) {
                    output.append("-ER");
                    break;
                }

                if (currD.equals("E")) currX++;
                else if (currD.equals("W")) currX--;
                else if (currD.equals("N")) currY++;
                else if (currD.equals("S")) currY--;
            } else {
                if (currD.equals("E") && instructions[i].equals("L"))
                    currD = "N";
                else if (currD.equals("E") && instructions[i].equals("R"))
                    currD = "S";
                else if (currD.equals("W") && instructions[i].equals("L"))
                    currD = "S";
                else if (currD.equals("W") && instructions[i].equals("R"))
                    currD = "N";
                else if (currD.equals("N") && instructions[i].equals("L"))
                    currD = "W";
                else if (currD.equals("N") && instructions[i].equals("R"))
                    currD = "E";
                else if (currD.equals("S") && instructions[i].equals("L"))
                    currD = "E";
                else if (currD.equals("S") && instructions[i].equals("R"))
                    currD = "W";
            }

            output.delete(0, output.length());
            output.append(currX + "-" + currY + "-" + currD);
        }
        return output.toString();
    }
}
