package week2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /* 정수 n을 입력받아 길이가 n인 1차원배열을 만들어라
         * 해당배열에 1~n까지의 수를 차례대로 할당하고 이를 출력하는 프로그램을 작성해라
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        int[] iArr = new int[n];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = i+1;
        }

        for (int i = 0; i < iArr.length; i++) {
            System.out.print(iArr[i]+" ");
        }

    }
}
