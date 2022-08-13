import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) throws Exception {
      int maxDigit = 6;
      som(maxDigit);
    
    }
    
    public static void som(int maxDigit){
        int fistD = 0;
        int secondD = 0;
        int thirdD = 0;
        int forthD = 0;
        
        for(int i = 0; i<maxDigit; i++){
            fistD = i;
            for(int j = 0; j < maxDigit; j++){
                secondD = j;
                for(int y = 0; y<maxDigit; y++){
                    thirdD = y;
                    for(int w = 0; w<maxDigit; w++){
                        forthD = w;
                        int som = i + j + y + w;
                        if(som == 21){
                            System.out.printf("%d%d%d%d", i, j , y, w);
                        }
                    }
                }
            }
        }
    }
}
