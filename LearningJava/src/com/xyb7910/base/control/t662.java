package com.xyb7910.base.control;

import java.util.Scanner;

public class t662 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if(x == 0) {
            System.out.println("Eixo Y");
        } else if(y == 0) {
            System.out.println("Eixo X");
        }
    }
}
