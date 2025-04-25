package org.example;

import java.util.Arrays;
import java.util.Scanner;

//public class Main {
//    public String solution(String str) {
//        String answer;
//        //System.out.println("str : " + str);
//        // str을 공백으로 쪼개서 배열에 넣음
//        // 각 배열 안에 있는 length를 비교해서 제일 많은 것을 출력
//        String[] arr = str.split(" ");
//        //System.out.println(Arrays.toString(arr));
//        answer = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            //System.out.println("arr[i] : " + arr[i].length());
//            if (arr[i].length() > answer.length()) {
//                answer = arr[i];
//            }
//        }
//        // 가장 길이가 긴 단어가 여러개일 경우 제일 앞쪽에 있는거 출력!!!
//        // 단어의 길이를 저장해둘까...?
//        // 아니면 마지막의 answer.length() 와 길이가 같다면 그거 return하고 break;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() == answer.length()) {
//                answer = arr[i];
//                break;
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        // sc.next()라고 하니까 str에 한단어, it만 저장됨..! 왜그러지ㅠ
//        System.out.println(T.solution(str));
//    }
//}

// 정답 - split() 이용
//public class Main {
//    public static String solution(String str) {
//        String answer = "";
//        int m = Integer.MIN_VALUE; // m을 가장 작은 숫자로 초기화
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(T.solution(str));
//    }
//}

// 정답 - indexOf 이용
public class Main {
    public static String solution(String str) {
        String answer = "";
        // m을 가장 작은 숫자로 초기화, pos는 position의 약자
        int m = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(" ")) != -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
             str = str.substring(pos+1);
        }
        if(str.length() > m) answer = str;
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}