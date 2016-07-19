import java.io.*;
import java.util.*;

public class Q2{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String firstString = reader.next();
        String secondString = reader.next();

        boolean result = checkPermutation(firstString, secondString);
        printOutput(firstString, secondString, result);
    }
    public static boolean checkPermutation(String first, String second){
        
        //Are the first and second string equal?
        if(first.length() != second.length()){
            return false;
        }
        
        //Assuming ASCII
        int[] letters = new int[128];

        char[] stringToCharArray = first.toCharArray();

        //Count each char in first
        for(char c : stringToCharArray){
            letters[c]++;
        }

        for(int i = 0; i < second.length(); i++){
            int c = (int) second.charAt(i);
            letters[c]--;
            
            //if the char stored is < 0 then not permutation
            if(letters[c] < 0)
                return  false;

        }

        return true;
    }
    public static void printOutput(String first, String second, boolean result){
        if(result)
            System.out.println(first + " is a permutation of " + second);
        else
            System.out.println(first + " is NOT a permutation of " + second);
    }
}
