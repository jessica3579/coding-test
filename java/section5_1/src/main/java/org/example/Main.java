package org.example;


// 내 코드
//import java.util.Scanner;
//
//public class Main {
//    public char solution(int n, String arr){
//        char answer;
////        System.out.println(arr);
//        int[] cnt = new int[5];
//        for(int i=0; i<n; i++){
//            if(arr.charAt(i) == 'A') {
//                cnt[0]++;
//            }
//            else if (arr.charAt(i) == 'B') {
//                cnt[1]++;
//            }
//            else if (arr.charAt(i) == 'C') {
//                cnt[2]++;
//            }
//            else if (arr.charAt(i) == 'D') {
//                cnt[3]++;
//            }
//            else cnt[4]++;
//        }
//
//        int a = -1;
//        // 가장 값이 많은 index 추출
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<5; i++) {
//            if(max < cnt[i]) {
//                a = i;
//                max = cnt[i];
//            }
//        }
//
//        if(a == 0) answer = 'A';
//        else if (a == 1) answer = 'B';
//        else if (a == 2) answer = 'C';
//        else if (a == 3) answer = 'D';
//        else answer = 'E';
//
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String arr = sc.next();
//        System.out.println(T.solution(n, arr));
//    }
//}

// 강사님 코드
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public char solution(int n, String arr){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : arr.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char x : map.keySet()){
            if(max < map.get(x)){
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr = sc.next();
        System.out.println(T.solution(n, arr));
    }
}