# Hacker Rank - Challenges
<p align="center">
  <img src="https://img.shields.io/static/v1?label=JDK &message=v11.0.14&color=red&style=flat&logo=appveyor&logo=openjdk"/>
  <img src="http://img.shields.io/static/v1?label=STATUS&message=Em Andamento&color=yellow&style=flat"/>
</p>

 <p align="center"><img src="https://github.com/almeidastor/imgsforreadme/blob/main/rackerankchal/icon.png"></p>


### Sumário
🔹 [Descrição](#descrição-do-projeto)

🔹 [Desafio 01: Welcome to Java!](#welcome-to-java)

🔹 [Desafio 02: Java Stdin and Stdout I](#java-stdin-and-stdout-i)

🔹 [Desafio 03: Java If-Else](#java-if-else)

🔹 [Desafio 04: Java Stdin and Stdout II](#java-stdin-and-stdout-ii)

🔹 [Desafio 05: Java Output Formatting](#java-output-formatting)

🔹 [Desafio 06: Java Loops I](#java-loops-i)

🔹 [](#)

🔹 [](#)

🔹 [](#)

🔹 [](#)

🔹 [](#)


## Descrição do projeto 
<p align="justify">
Resoluções do desafio Hacker Rank/2022
</p>

## Welcome to Java!
Welcome to the world of Java! In this challenge, we practice printing to stdout.

The code stubs in your editor declare a Solution class and a main method. Complete the main method by copying the two lines of code below and pasting them inside the body of your main method.

* System.out.println("Hello, World.");
* System.out.println("Hello, Java.");

Input Format

There is no input for this challenge.

Output Format

You must print two lines of output:

    Print Hello, World. on the first line.
    Print Hello, Java. on the second line.

Sample Output

    Hello, World.
    Hello, Java.
 

(<a href="https://github.com/almeidastor/RackerHank_challenges/blob/main/src/main/java/com/mycompany/rackerhank_challenges/Welcome_to_Java.java">Resolução</a>)



## Java Stdin and Stdout I
* Task
In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

* Input Format

There are 3 lines of input, and each line contains a single integer.

Sample input

    42
    100
    125

Sample Output

    42
    100
    125

(<a href="https://github.com/almeidastor/RackerHank_challenges/blob/main/src/main/java/com/mycompany/rackerhank_challenges/Java_Stdin_and_Stdout_I.java">Resolução</a>)


## Java If-Else
* Task
Given an integer,n, perform the following conditional actions:

 If n is odd, print Weird; 
 If n is even and in the inclusive range of 2 to 5, print Not Weird;
 If n is even and in the inclusive range of 6 to 20, print Weird;
 If n is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not n is weird.

* Input Format
A single line containing a positive integer, n.

* Constraints
1 ≤ n ≥ 100

Sample input 0

    3

Sample Output 0

    Weird
  
Sample input 1

    24

Sample Output 1

    Not Weird

* Input Format
Sample Case 0: n=3
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n=24
n>20 and is even, so it isn't weird. Thus, we print Not Weird.

(<a href="">Resolução</a>)

## Java Stdin and Stdout II
* Task
In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.

Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.

* Input Format
There are three lines of input:

 The first line contains an integer.
 The second line contains a double.
 The third line contains a String.

* Output Format
There are three lines of output:

 On the first line, print String: followed by the unaltered String read from stdin.
 On the second line, print Double: followed by the unaltered double read from stdin.
 On the third line, print Int: followed by the unaltered integer read from stdin.

To make the problem easier, a portion of the code is already provided in the editor.

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

Sample input 

    24
    3.1415
    Welcome to HackerRank's Java tutorials!

Sample Output 

    String: Welcome to HackerRank's Java tutorials!
    Double: 3.1415
    Int: 42

(<a href="">Resolução</a>)

## Java Output Formatting
* Task
Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

* Input Format
Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range 0 from to 999


* Output Format
In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input 

    java 100
    cpp 65
    python 50


Sample Output

    ================================
    java           100
    cpp            065
    python         050
    ================================
    

* Explanation

Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.

(<a href="">Resolução</a>)

## Java Loops I
* Task
Given an integer,N, print its first 10 multiples. Each multiple N x i (where 1≤i≤10) should be printed on a new line in the form: N x i = result.

* Input Format
A single integer, N .

* Constraints
2≤N≤20

* Output Format
Print 10 lines of output; each line i (where 1≤i≤10) contains the result of N x i in the form: 
N x i = result.

Sample Input 

    2


Sample Output

    2 x 1 = 2
    2 x 2 = 4
    2 x 3 = 6
    2 x 4 = 8
    2 x 5 = 10
    2 x 6 = 12
    2 x 7 = 14
    2 x 8 = 16
    2 x 9 = 18
    2 x 10 = 20

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)

## 
* Task

(<a href="">Resolução</a>)