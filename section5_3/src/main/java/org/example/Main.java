package org.example;

// 내 시도 -> time limit exceeded 뜸
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Scanner;
//
//public class Main {
//    public LinkedHashMap<Integer, Integer> solution(int n, int k, int[] arr){
//        LinkedHashMap<Integer, Integer> answer = new LinkedHashMap<>();
//        HashMap<Integer, Integer> a = new HashMap<>();
//
//        for(int i=0; i<k; i++){
//            a.put(arr[i], a.getOrDefault(arr[i], 0)+1);
//        }
//        answer.put(0, a.size());
//        int lt = 0;
//        for(int rt = k; rt < n; rt++){
//            a.put(arr[lt], a.get(arr[lt])-1);
//            if(a.get(arr[lt]) == 0) a.remove(arr[lt]);
//            a.put(arr[rt], a.getOrDefault(arr[rt], 0)+1);
//            answer.put(lt+1, a.size());
//            lt++;
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++)
//            arr[i] = sc.nextInt();
//        for(int x : T.solution(n, k, arr).keySet())
//            System.out.print(T.solution(n, k, arr).get(x) + " ");
//    }
//}

// 강사님 코드

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> a = new HashMap<>();

        for (int i = 0; i < k-1; i++) {
            a.put(arr[i], a.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            a.put(arr[rt], a.getOrDefault(arr[rt], 0) + 1);
            answer.add(a.size());
            a.put(arr[lt], a.get(arr[lt]) - 1);
            if(a.get(arr[lt]) == 0) a.remove(arr[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int x : T.solution(n, k, arr))
            System.out.print(x + " ");
    }
}