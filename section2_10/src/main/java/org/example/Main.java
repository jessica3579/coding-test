package org.example;

// 실패한 내 코드
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    ArrayList<Integer> solution(String str, String s){
//        ArrayList<Integer> answer = new ArrayList<>(str.length());
//        System.out.println(str + " " + s);
//        char c = s.charAt(0);
//        int[] c_index_arr = new int[str.length()];
//        int count = 0;
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == c) {
//                c_index_arr[count] = i;
//                count++;
//            }
//        }
//
//        for(int i=0; i<=count; i++){
//            for(int j=0; j<str.length(); j++){
//                answer.set(j, Math.abs(c_index_arr[i] - j));
//            }
//
//        }
//
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String[] arr = s.split(" ");
//        System.out.println(T.solution(arr[0], arr[1]));
//    }
//}

// 강사님 코드

import java.util.Scanner;

public class Main {
    int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int d = 1000; // 거리
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                d = 0;
                answer[i] = d;
            } else {
                d++;
                answer[i] = d;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                d = 0;
            } else {
                d++;
                answer[i] = Math.min(answer[i], d);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int x : T.solution(str, c))
            System.out.print(x + " ");
    }
}
