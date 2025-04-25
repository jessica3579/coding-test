package org.example;

// 내 코드 -> 정답
//import java.util.*;
//
//public class Main {
//    String solution(String str){
//        String answer = "";
//        int count = 0;
//        // 이전 문자열과 같으면 count +1
//        // 다르면 이전 count를 answer에 넣고 그리고 count=0으로 다시 count 시작
//        for(int i=0; i<str.length(); i++){
//            if(i == str.length()-1){
//                //System.out.println(" 여기 출력 ");
//                if(str.charAt(i) == str.charAt(i-1)){
//                    //System.out.println(" 요 출력 ");
//                    count++;
//                    answer += str.charAt(i);
//                    answer += count;
//                    break;
//                } else{
//                    //System.out.println(" 기 출력 ");
//                    answer += str.charAt(i);
//                    break;
//                }
//            }
//            if(str.charAt(i) == str.charAt(i+1)){
//                count++;
//            }else {
//                count++;
//                answer += str.charAt(i);
//                if(count != 1) answer += count;
//                count = 0;
//            }
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

// 강사님 정답
import java.util.*;

public class Main {
    String solution(String str){
        String answer = "";
        str = str + " "; // outofBound 오류가 나지 않도록 하게 하기 위해서!!
        int count = 1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else {
                answer += str.charAt(i);
                // if(count != 1) answer += count;
                if(count>1) answer+= String.valueOf(count);
                count = 1;
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