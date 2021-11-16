package com.company;

import java.util.Scanner;


public abstract class Math {
    int A;
    int B;
    int C;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
    }

   public void write() {
       System.out.println(C);
   }
}
