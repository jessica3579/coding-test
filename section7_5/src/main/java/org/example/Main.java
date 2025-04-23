package org.example;

// 내 풀이
//import java.util.Scanner;
//
//public class Main {
//    public char solution(int n, int[] arr){
//        char answer = 'U';
//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                if(arr[i] == arr[j]) return 'D';
//            }
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//        System.out.println(T.solution(n, arr));
//    }
//}

// HashMap을 활용한 풀이
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Main {
//    public char solution(int n, int[] arr){
//        HashMap<Integer, Boolean> map = new HashMap<>();
//
//        for(int i=0; i<n; i++){
//            if(map.containsKey(arr[i])) return 'D';
//            map.put(arr[i], true);
//        }
//        return 'U';
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//        System.out.println(T.solution(n, arr));
//    }
//}

// 정렬을 이용한 풀이
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public char solution(int n, int[] arr){
        char answer = 'U';
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) if(arr[i] == arr[i+1]) return 'D';
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, arr));
    }
}