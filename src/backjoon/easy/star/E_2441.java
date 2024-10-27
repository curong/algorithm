package backjoon.easy.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_2441 {
    public static void main(String[] args) throws IOException {

        int cnt = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        StringBuilder sb = new StringBuilder();

        for (int line = cnt; line > 0; line--) {

            for (int space = cnt - line; space > 0; space--) {
                sb.append(' ');
            }

            for (int star = line; star > 0; star--) {
                sb.append('*');
            }

            sb.append('\n');
        }
        System.out.println(sb);
    }
}
