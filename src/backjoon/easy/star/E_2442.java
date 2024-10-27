package backjoon.easy.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_2442 {
    public static void main(String[] args) throws IOException {

        int cnt = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        StringBuilder sb = new StringBuilder();

        for (int line = 1; line <= cnt; line++) {

            for (int leftSpace = cnt - line; leftSpace > 0; leftSpace--) sb.append(' ');
            for (int star = 0 ; star < line * 2 - 1 ; star++) sb.append('*');
            sb.append('\n');
        }
        System.out.println(sb);


    }
}
