package backjoon.easy;

import java.io.*;

public class E_8393 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result = result + i;
        }
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();

    }
}
