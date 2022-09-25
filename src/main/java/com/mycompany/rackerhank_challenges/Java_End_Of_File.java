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
public class Java_End_Of_File {
    public static void main(String[] args) {
        int i=1;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}
