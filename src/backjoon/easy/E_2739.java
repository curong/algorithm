package backjoon.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_2739 {
    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());



        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }




    }
}
