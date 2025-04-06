package org.example;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] a){
        int answer=0, value=Integer.MIN_VALUE;
        int[] cnt = new int[n];
        // 1번 학생, 2번 학생..
        for(int i=0; i<n; i++){
            // 학년별!
            for(int j=0; j<5; j++){
                for(int k=0; k<n; k++){
                    if(a[i][j] == a[k][j]) {
                        cnt[i]++;
                        System.out.println("a[i][j] : " + i + " " + j + "  a[k][j] : " + k + " " + j );
                    }
                }
            }
            System.out.println("cnt i : " + cnt[i]);
        }
        for(int i=0; i<n; i++){
            if(cnt[i] > value) value = cnt[i];
        }
        //System.out.println("value " + value);
        for(int i=0; i<n; i++){
            //System.out.println("cnt[i] : " + cnt[i] + " value : " + value);
            if(cnt[i] == value) {
                //System.out.println(cnt[i] + "     " + value);
                answer = i+1;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}