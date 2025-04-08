package org.example;

//import java.util.Scanner;
//
//public class Main {
//    public int[] solution(int n, int m, int[] arr1, int[] arr2){
//        int[] answer = new int[n+m];
//        // 각각 배열에 넣었던 index를 저장
//        int a=0, b=0;
//        for(int i=0; i<n+m; i++){
//            if(a<n && b<m){
//                if(arr1[a] > arr2[b]){
//                    answer[i] = arr2[b];
//                    b++;
//                }else{
//                    answer[i] = arr1[a];
//                    a++;
//                }
//            } else if (a<n) {
//                answer[i] = arr1[a];
//                a++;
//            } else if (b<m) {
//                answer[i] = arr2[b];
//                b++;
//            }
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr1 = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        int m = sc.nextInt();
//        int[] arr2 = new int[m];
//        for (int i = 0; i < m; i++) {
//            arr2[i] = sc.nextInt();
//        }
//        for (int x : T.solution(n, m, arr1, arr2))
//            System.out.print(x + " ");
//    }
//}

// 강사님 풀이
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : T.solution(n, m, a, b))
            System.out.print(x + " ");
    }
}