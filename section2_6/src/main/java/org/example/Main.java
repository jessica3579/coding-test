package org.example;

import java.util.Scanner;

// 내 코드
//public class Main {
//    String solution(String str) {
//        String answer = "";
//        // 문자열을 문자 배열로 만듦...!
//        // 그리고 해당 순서 이전까지의 순서를 탐색해서 같은게 있으면 문자열에 넣지 않고
//        // 없는 경우에만 문자열에 넣음!!!
//
//        char[] c = str.toCharArray();
//        answer += c[0];
//        for (int i = 1; i < c.length; i++) {
//            int count = 0;
//            for (int j = 0; j < i; j++) {
//                if (c[i] == c[j]) count++;
//            }
//            if (count == 0) answer += c[i];
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(T.solution(str));
//    }
//}

// 강사님 코드
public class Main {
    String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}