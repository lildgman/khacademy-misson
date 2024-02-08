package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1046 {
    public static void main(String[] args) throws IOException {
        int total;
        double avg;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        int count = st.countTokens();
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        total = num1 + num2 + num3;
        avg = (double)total/count;

        System.out.println(total);
        System.out.printf("%.1f",avg);
    }
}
