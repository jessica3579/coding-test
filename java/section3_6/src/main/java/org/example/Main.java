package org.example;

// 내 코드
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    ArrayList<Integer> solution(int n, int[] a){
//        ArrayList<Integer> answer = new ArrayList<>();
//        // 숫자 뒤집기!! 흠.. 어떻게 뒤집어야하지,,,,
//        // 23 -> 32 100 -> 001 일단 숫자를 string으로 한다음에,,,
//        // string 뒤집는거 했었는데,,, tmp 에 저장해둬서 바꿈..
//        // 아니다.. int를 유지하되.. 각각 쪼갬 그래서 배열로 바꾸기
//        String[] arr = new String[n];
//        for(int i=0; i<n; i++){
//            arr[i] = String.valueOf(a[i]); // 숫자를 일단 string으로 바꿈
//            // 그리고 각 문자열을 split해서 배열에 넣음
//            String[] tmp = arr[i].split("");
//            String t="";
//            for(int j=0; j<arr[i].length()/2; j++){
//                String s = tmp[j];
//                tmp[i] = tmp[arr[i].length()-1];
//                tmp[arr[i].length()-1] = s;
//                t += arr[i];
//            }
//            // String tmp 배열을 문자열로,..?
//            arr[i] = t;
//            System.out.println(arr[i]);
//        }
//
//        for(int i=0; i<n; i++){
//
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for(int i=0; i<n; i++) a[i] = sc.nextInt();
//        for(int x : T.solution(n, a))
//            System.out.print(x + " ");
//    }
//}


// 강사님 코드
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int x : T.solution(n, a))
            System.out.print(x + " ");
    }
}