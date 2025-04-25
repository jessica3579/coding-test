package org.example;

// 내 시도 -> 정답
//import java.util.Scanner;
//
//public class Main {
//    public int solution(int n, int[][] arr) {
//        int answer = 0, max = 0, sum = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                sum += arr[i][j];
//            }
//            if (sum > max) max = sum;
//            sum =0;
//            for (int j = 0; j < n; j++) {
//                sum += arr[j][i];
//            }
//            if (sum > max) max = sum;
//            sum = 0;
//        }
//        sum = 0;
//        for(int i=0; i<n; i++){
//            sum += arr[i][i];
//        }
//        if(sum>max) max = sum;
//        answer = max;
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++)
//            for (int j = 0; j < n; j++)
//                arr[i][j] = sc.nextInt();
//        System.out.println(T.solution(n, arr));
//    }
//}

// 강사님 코드

import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE, sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        System.out.println(T.solution(n, arr));
    }
}