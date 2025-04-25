package org.example;

// 내 시도
//import java.util.Scanner;
//
//public class Main {
//    public int[] set(int n, int num, int[][] a) {
//        int[] arr = new int[n * (n - 1) / 2];
//        for (int k = 0; k < n * (n - 1) / 2; k++) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 1; j < n; j++) {
//                    arr[k] = a[i][j]
//                }
//            }
//        }
//
//        return arr;
//    }
//
//    public int solution(int n, int m, int[][] a) {
//        int[] arr = new int[6];
//        int answer, cnt = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < 6; k++) {
//
//                }
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m = sc.nextInt();
//        int[][] a = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println(T.solution(n, m, a));
//    }
//}


// 강사님 풀이
import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i=1; i <=n ; i++) {
            for (int j=1; j<=n; j++) {
                int cnt=0;
                for (int k=0; k<m; k++) {
                    int pi=0, pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}

