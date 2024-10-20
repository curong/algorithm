package backjoon.easy.star;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class E_2440 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            IntStream.rangeClosed(1, N).mapToObj(i -> "*".repeat(N - i + 1) + "\n").forEach(System.out::print);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
