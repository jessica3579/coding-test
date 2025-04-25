package org.example;

// 내 풀이 -> 오답 (문제 이해 잘못함)
//import java.util.Scanner;
//
//public class Main {
//    public int solution(int n, int[][] a){
//        int answer=0, value=Integer.MIN_VALUE;
//        int[] cnt = new int[n];
//        // 1번 학생, 2번 학생..
//        for(int i=0; i<n; i++){
//            // 학년별!
//            for(int j=0; j<5; j++){
//                /// 비교할 학생
//                for(int k=0; k<n; k++){
//                    if(a[i][j] == a[k][j]) {
//                        cnt[i]++;
//                        break;
//                        //System.out.println("a[i][j] : " + i + " j:" + j + "  a[k][j] : " + k + " " + j );
//                    }
//                }
//            }
//        }
//        for(int i=0; i<n; i++){
//            if(cnt[i] > value) value = cnt[i];
//        }
//        //System.out.println("value " + value);
//        for(int i=0; i<n; i++){
//            //System.out.println("cnt[i] : " + cnt[i] + " value : " + value);
//            if(cnt[i] == value) {
//                //System.out.println(cnt[i] + "     " + value);
//                answer = i+1;
//                break;
//            }
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][5];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<5; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println(T.solution(n, arr));
//    }
//}

// 다시 시도 - 출력 어떻게 하는지 모르겠음
//import java.util.Scanner;
//
//public class Main {
//    public int solution(int n, int[][] a){
//        int answer=0, value=Integer.MIN_VALUE;
//        int[] cnt = new int[n];
//        // 기준이 되는 학생
//        for(int i=0; i<n; i++){
//            // 비교가 되는 학생
//            for(int j=0; j<n; j++){
//                // 학년별
//                for(int k=0; k<5; k++){
//                    if(a[i][k] == a[j][k]) {
//                        cnt[i]++;
//                        break;
//                    }
//                }
//            }
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][5];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<5; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println(T.solution(n, arr));
//    }
//}


// 강사님 풀이
import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] a){
        int answer=0, max=Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(a[i][k] == a[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}