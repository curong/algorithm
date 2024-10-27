package backjoon.easy.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_2443_GPT {
    public static void main(String[] args) throws IOException {

        int cnt = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = -cnt + 1; i < cnt; i++) {
            int absI = Math.abs(i);
            for (int space = 0; space < absI; space++) sb.append(' ');
            for (int star = 0; star < (2 * (cnt - absI) - 1); star++) sb.append('*');
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
