package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1057 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a == 0) {
            if (b == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if (a == 1) {
            if (b == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
