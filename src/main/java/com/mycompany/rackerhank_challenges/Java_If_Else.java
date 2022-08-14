package com.mycompany.rackerhank_challenges;

import java.util.Scanner;


public class Java_If_Else {
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (!(N%2==0) || (N>=6&&N<=20)) {
            System.out.print("Weird");
            
    } else {
            System.out.print("Not Weird");
        }
        
            scanner.close();
    
    }
        
}
