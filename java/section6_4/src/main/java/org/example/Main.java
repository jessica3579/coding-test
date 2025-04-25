package org.example;

// 내 코드 -> 출력이 잘 안됨
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//    public int solution(String str){
//        int answer=0;
//        Stack<Integer> stack = new Stack<>();
//        for(char x : str.toCharArray()){
//            if(x >= 48 && x <= 57){
//                int num = (int)x;
//                // 숫자면 그냥 stack에 쌓음
//                stack.push(num);
//            }else{
//                // 문자면 계산
//                // 여기서 강제 형변환 할떄 3이면 3으로 들어가는게 아니라 아스키 코드 수로 들어감..
//                int n1 = (int)stack.pop(), n2 = (int)stack.pop();
//
//                if(x == '+') {
//                    stack.push(n2 + n1);
//                }
//                else if(x == '*') {
//                    stack.push(n2 * n1);
//                }
//                else if(x == '-') {
//                    stack.push(n2 - n1);
//                }
//                else {
//                    stack.push(n2 / n1);
//                }
//            }
//        }
//        answer = stack.pop();
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
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.pop();
        //answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}