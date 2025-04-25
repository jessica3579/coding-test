package org.example;

// 내 코드 정답
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//    public String solution(String str){
//        String answer = "";
//        Stack<Character> stack = new Stack();
//        for(char x : str.toCharArray()){
//            if(x == '(') stack.push('(');
//            else if(x == ')') stack.pop();
//            else {
//                // 문자인 경우
//                if(stack.isEmpty()) answer += x;
//            }
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(T.solution(str));
//    }
//}

// 강사님 코드
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack();
        for(char x : str.toCharArray()){
            if(x == ')'){
                while(stack.pop() != '(');
            }else stack.push(x);
        }
        for(int i=0; i<stack.size(); i++) answer += stack.get(i);
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}