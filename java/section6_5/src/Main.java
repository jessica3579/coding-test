// 내 코드
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//    public int solution(String str){
//        int answer = 0;
//        Stack<Character> stack = new Stack<>();
//        for(char x : str.toCharArray()){
//            if(x == '(') stack.push(x);
//            else {
//                stack.pop();
//                answer += stack.size();
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
    public int solution(String str){
        int answer = 0;
        boolean isRaser = false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
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