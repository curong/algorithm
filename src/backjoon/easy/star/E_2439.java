package backjoon.easy.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_2439 {
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        StringBuilder sb = new StringBuilder();

        // 5칸 블럭
        for (int i = N; i > 0; i--) {

            for (int j = 1; j < i; j++) {
                sb.append(' ');
            }

            for (int k = N-i; k >= 0; k--) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
