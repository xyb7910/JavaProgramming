package com.xyb7910.base.control;

import java.util.Scanner;

public class t663 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float max_v = Math.max(a, Math.max(b, c));
        if (max_v >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (max_v * max_v == b * b + c * c) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (a * a > b * b + c * c) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (a * a < b * b + c * c) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if(a == b || b == c || a == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
