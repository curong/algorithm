package backjoon.easy.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_2438 {
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        StringBuilder sbr = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                sbr.append("*");
            }
            sbr.append('\n');
        }

        System.out.println(sbr);
    }
}
