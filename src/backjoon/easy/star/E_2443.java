package backjoon.easy.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_2443 {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in)).readLine()));
        int halfLine = (cnt * 2 - 2) / 2;
        int overMinus = 1;


        for (int line = 1; line < (cnt * 2 + 1); line++) {
            if (line > halfLine) {

                overMinus--;
                for (int space = halfLine - overMinus; space > 0; space--) sb.append(' ');
                for (int star = 0 ; star < (halfLine - overMinus) * 2 + 1 ; star++) sb.append('*');

            } else {

                for (int space = 0; space < cnt - line; space++) sb.append(' ');
                for (int star = 1; star <= line * 2 -1; star++) sb.append('*');

            }

            sb.append('\n');

        }

        System.out.println(sb);
    }
}
