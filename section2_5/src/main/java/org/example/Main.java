package org.example;

import java.util.Scanner;

//// 처음 푼 방식!!!
//public class Main {
//    String solution(String str){
//        String answer = "";
//        // 문자열을 문자 배열로 바꾸기
//        char[] arr = str.toCharArray();
//        for(int i=0; i<arr.length/2; i++){
//            // 그리고 문자인지 특수문자인지 판단 후 inddex로 접근!!
//            // 문자인지 특수문자인지 판단하는 방법은 아스키코드로!!
//            Boolean a = (arr[i] >= 65 && arr[i] <= 90 ) || ( arr[i]>=97 && arr[i]<=122 );
//            Boolean b= (arr[arr.length-1-i] >= 65 && arr[arr.length-1-i] <= 90 ) || ( arr[arr.length-1-i]>=97 && arr[arr.length-1-i]<=122 );
//            if(a && b){
//                char temp = arr[i];
//                arr[i] = arr[arr.length-1-i];
//                arr[arr.length-1-i] = temp;
//            }
//        }
//        answer = String.valueOf(arr);
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.print(T.solution(str));
//    }
//}

// 강사님의 설명을 듣고 푼 방식 -> lt, rt 도입
public class Main {
    String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}