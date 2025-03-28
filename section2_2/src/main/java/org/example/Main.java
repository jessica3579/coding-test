package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";

//        // 배열로 만들기?!
//        char[] arr = str.toCharArray();
//        // char->int는 암묵적 자료 형변환이 됨!
//        for (int i = 0; i < str.length(); i++) {
//            if (arr[i] >= 65 && arr[i] <= 90) arr[i] += 32;
//            else arr[i] -= 32;
//        }
//        answer = String.valueOf(arr);
//        //answer = new String(arr);

//        // 향상된 for문 - Character.isLowerCase() 함수 이용
//        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
//        }

        // 향상된 for문 - ASCII Code 이용
        for(char x : str.toCharArray()){
            if(x>=65 && x<=90) answer += (char)(x + 32);
            else answer += (char)(x - 32);
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
