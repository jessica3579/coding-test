package org.example;

import java.util.Scanner;

class Main{
    public int solution(String str, char c){
        int answer =0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

//        // index이용
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == c) answer++;
//        }

        // 향상된 for문 이용
        for(char a : str.toCharArray()){
            if(a==c) answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}