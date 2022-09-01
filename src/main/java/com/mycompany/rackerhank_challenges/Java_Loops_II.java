/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rackerhank_challenges;

import java.util.Scanner;

/**
 *
 * @author Stor
 */
public class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            
             int soma = a;
            for(int c=0;c<n;c++)
            {
                soma+=(Math.pow(2,c)*b);
                System.out.print(soma+" ");
            }
           
            System.out.println();
       
        }
        in.close();
    }
}
