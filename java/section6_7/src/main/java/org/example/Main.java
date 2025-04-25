package org.example;

// 내 코드
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Main {
//    public String solution(String str1, String str2) {
//        int cnt = 0;
//        String tmp = "";
//        Queue<Character> Q = new LinkedList<>();
//        for (char x : str2.toCharArray()) Q.offer(x);
//
//        while (Q.size() != str1.length()) {
//            if (cnt < str1.length() && Q.peek() == str1.charAt(cnt)) {
//                Q.offer(Q.poll());
//                cnt++;
//            } else Q.poll();
//        }
//        for (char x : Q) tmp += x;
//        if (tmp.equals(str1)) return "YES";
//        else return "NO";
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        System.out.println(T.solution(str1, str2));
//    }
//}

// 강사님 코드
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.offer(x);
        for(char x : plan.toCharArray()){
            if(Q.contains(x)){
                if(x != Q.poll()) return "NO";
             }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(T.solution(str1, str2));
    }
}