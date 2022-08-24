
package com.mycompany.rackerhank_challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Java_Loops_I {
 public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int M = 1;
        
        for ( M = 1; M <= 10; M++) {
        System.out.println(N + " x " + M +" = "+ N*M);
}

        bufferedReader.close();
    }   
}
