import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        int min=10000;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        
        if (n ==0 ){
           System.out.println(0);
           System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            
            if (t !=0 && Math.abs(min)> Math.abs(t)){
                  min=t; 

            }else if (t !=0 && Math.abs(min)==Math.abs(t)){
                  min=Math.max(min,t);
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(min);
    }
}
