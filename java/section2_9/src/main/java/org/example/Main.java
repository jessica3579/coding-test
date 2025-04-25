package org.example;

// 내 풀이
//import java.util.Scanner;
//
//public class Main {
//    int solution(String str){
//        int answer;
//        String tmp = "";
//        // 숫자면 string 값에 넣기
//        // 그 string에서 앞에 0이 아니면 int로 바꾸기
//        for(int i = 0; i<str.length(); i++){
//            if(Character.isDigit(str.charAt(i))) tmp += str.charAt(i);
//        }
//        // charAt으로 접근해서 만약 0 값이면 해당 인덱스의 값을 없애버림
//        while(tmp.charAt(0) == '0'){
//            // 첫째 글자가 0이라는 것이니까 잘라내야함!!
//            tmp = tmp.substring(1);
//        }
//        answer = Integer.parseInt(tmp);
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(T.solution(str));
//    }
//}

// 강사님 풀이 - 방법1 ( ASCII CODE 이용 )
//import java.util.Scanner;
//
//public class Main {
//    int solution(String str){
//        int answer = 0;
//        for(char x : str.toCharArray()){
//            if( x>=48 && x<= 57 ) answer = answer * 10 + ( x - 48 );
//        }
//
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(T.solution(str));
//    }
//}

// 강사님 풀이2 - Character.isDigit() 이용
import java.util.Scanner;

public class Main {
    int solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}

