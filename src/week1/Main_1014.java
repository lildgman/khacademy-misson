package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1014 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str," ");
        char ch1 = st.nextToken().charAt(0);
        char ch2 = st.nextToken().charAt(0);


        System.out.println(ch2+ " "+ch1);

    }
}
