import java.io.*;
import java.util.*;

public class Q3{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String theString = reader.nextLine();
        int trueLength = reader.nextInt();

        String result = replaceString(theString, trueLength);
        System.out.println(result);
    }
    public static String replaceString(String theString, int trueLength){
        char[] theCharArray = theString.toCharArray();

        int numOfSpaces = 0;

        for(int i = 0; i < trueLength; i++){
            if(theCharArray[i] == ' '){
                numOfSpaces++;
            }
        }

        int index = trueLength + numOfSpaces * 2;

        for(int i = trueLength - 1; i >= 0; i--){
            if(theCharArray[i] == ' '){
                theCharArray[index - 1] = '0';
                theCharArray[index - 2] = '2';
                theCharArray[index - 3] = '%';
                index = index - 3;
            }
            else{
                theCharArray[index - 1] = theCharArray[i];
                index--;
            }
        }

        String result = new String(theCharArray);
        return result;
    }
}
