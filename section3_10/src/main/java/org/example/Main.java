package org.example;

// 내 시도 -> 정답
//import java.util.Scanner;
//
//public class Main {
//    public int max(int a, int b, int c, int d){
//        return Math.max(Math.max(Math.max(a, b), c), d);
//    }
//    public int solution(int n, int[][] a){
//        int answer =0, cnt = 0;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(a[i][j] > max(a[i-1][j], a[i][j-1], a[i][j+1], a[i+1][j])) cnt++;
//            }
//        }
//        answer = cnt;
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] a = new int[n+2][n+2];
//        for(int i=1; i<=n; i++)
//            for(int j=1; j<=n; j++)
//                a[i][j] = sc.nextInt();
//        System.out.println(T.solution(n, a));
//    }
//}


// 강사님 풀이
import java.util.Scanner;

public class Main {
    int[] dx = {0, -1, 0, 1};
    int[] dy = {1, 0, -1, 0};
    public int solution(int n, int[][] a){
        int answer =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = i + dy[k];
                    if(nx>=0 && nx < n && ny>=0 && ny<n && a[i][j] <= a[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                a[i][j] = sc.nextInt();
        System.out.println(T.solution(n, a));
    }
}