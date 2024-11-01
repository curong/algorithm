package backjoon.easy.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_2440 {

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = N; i > 0; i--) {

            for(int j = i; j > 0; j--) {
                sb.append('*');
            }

            sb.append('\n');
        }
        System.out.println(sb);

    }
}
