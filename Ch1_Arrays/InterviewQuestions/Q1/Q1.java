import java.io.*;
import java.util.*;

public class Q1{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String theString = reader.next();

        boolean value = isUnique(theString);
        printOutput(theString, value);
    }
    public static boolean isUnique(String aString){
        boolean result = true;

        for(int i = 0; i < aString.length(); i++){
            char theChar = aString.charAt(i);

            for(int j = i+1; j < aString.length(); j++){
                char otherChar = aString.charAt(j);

                if(theChar == otherChar){
                    result = false;
                    return result;
                }
            }
        }
        return result;
    }
    public static void printOutput(String theString,boolean aValue){
        if(aValue){
            System.out.println(theString + " is unique!");
        }
        else{
            System.out.println(theString + " is NOT unique!");
        }
    }
}



