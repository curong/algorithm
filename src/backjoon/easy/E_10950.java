package backjoon.easy;

import java.io.*;

public class E_10950 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String[] arr = br.readLine().split(" ");
            int sum  = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            bw.write(sum + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
