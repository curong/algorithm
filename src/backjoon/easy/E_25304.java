package backjoon.easy;

import java.io.*;

public class E_25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        int totalPrice = Integer.parseInt(br.readLine());
        int totalCount = Integer.parseInt(br.readLine());
        int sumPrice = 0;

        for (int i = 0; i < totalCount; i++) {
            String[] line = br.readLine().split(" ");
            sumPrice += (Integer.parseInt(line[0]) * Integer.parseInt(line[1]));
        }

        if (totalPrice == sumPrice) {
            bw.write(sumPrice);


            bw.write("YES\n");
        } else {
            bw.write(sumPrice);
            bw.write("NO\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
