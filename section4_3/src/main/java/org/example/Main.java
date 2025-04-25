package org.example;

import java.util.Scanner;

// 내 방식
//public class Main {
//    public int solution(int n, int k, int[] a){
//        int answer, max = 0, p1=0, p2=k;
//        for(int i=0; i<k; i++) max+= a[i];
//        int sum = max;
//
//        while(p2 < n){
//            sum -= a[p1];
//            sum += a[p2];
//            if(max < sum) max = sum;
//            p1++;
//            p2++;
//        }
//        answer = max;
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc  = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] a = new int[n];
//        for(int i=0; i<n; i++) a[i] = sc.nextInt();
//        System.out.println(T.solution(n, k, a));
//    }
//}

// 강사님 코드
public class Main {
    public int solution(int n, int k, int[] a){
        int answer=0, sum=0;
        for(int i=0; i<k; i++) sum += a[i];
        answer = sum;
        for(int i=k; i<n; i++){
            sum += (a[i] - a[i-k]);
            answer = Math.max(sum, answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        System.out.println(T.solution(n, k, a));
    }
}