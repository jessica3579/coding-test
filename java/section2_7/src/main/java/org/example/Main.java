package org.example;

// 내가 푼 코드
//import java.util.Scanner;
//
//public class Main {
//    String solution(String str){
//        String answer = "YES";
//        char[] c = str.toCharArray();
//        int lt = 0, rt = str.length()-1;
//        while( lt < rt ){
//            if(c[lt] != c[rt]) {
//                answer = "NO";
//                break;
//            }
//            lt++;
//            rt--;
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        str = str.toLowerCase();
//        System.out.println(T.solution(str));
//    }
//}


// 강사님 코드 - 방법 1
//import java.util.Scanner;
//
//public class Main {
//    String solution(String str){
//        String answer = "YES";
//        str = str.toLowerCase();
//        int len = str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        str = str.toLowerCase();
//        System.out.println(T.solution(str));
//    }
//}

// 강사님 코드 - 방법2
import java.util.Scanner;

public class Main {
    String solution(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
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

