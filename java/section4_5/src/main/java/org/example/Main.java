package org.example;

// 내가 푼 코드
//import java.util.Scanner;
//
//public class Main {
//    public int solution(int n) {
//        int answer = 0, sum = 0;
//        if (n % 2 == 0) {
//            for (int i = 1; i <= n / 2; i++) {
//                for (int j = i; j <= n / 2; j++) {
//                    sum += j;
//                    if (sum == n) answer++;
//
//                    else if (sum > n) break;
//                }
//                sum = 0;
//            }
//        } else {
//            for (int i = 1; i <= n / 2 + 1; i++) {
//                for (int j = i; j <= n / 2 + 1; j++) {
//                    sum += j;
//                    if (sum == n) answer++;
//                    else if (sum > n) break;
//                }
//                sum = 0;
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(T.solution(n));
//    }
//}

// 강사님 코드
import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int answer = 0, sum = 0, lt=0;
        int m = n/2 + 1;
        int[] arr = new int[m];
        for(int i=0; i<m; i++) arr[i] = i+1;

        for(int rt=0; rt <m; rt++){
            sum += arr[rt];

            while(sum > n){
                sum -= arr[lt++];
            }

            if(sum == n) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}