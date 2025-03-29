package org.example;

import java.util.Scanner;

public class Main {
    String solution(String str){
        String answer = "YES";
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while( lt < rt ){
            if(c[lt] != c[rt]) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();
        System.out.println(T.solution(str));
    }
}