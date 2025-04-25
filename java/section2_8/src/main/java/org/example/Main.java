package org.example;

// 내 풀이 -> 정답
//import java.util.Scanner;
//
//public class Main {
//    String solution(String str) {
//        String answer = "YES";
//        str = str.toLowerCase();
//        int lt = 0, rt = str.length() - 1;
//        while (lt < rt) {
//            // 문자열인 경우에만,,,,,
//            // 특수문자인 경우에는 그냥 증가....?
//            if (!Character.isAlphabetic(str.charAt(lt))) lt++;
//            else if (!Character.isAlphabetic(str.charAt(rt))) rt--;
//            else {
//                if (str.charAt(lt) != str.charAt(rt)) {
//                    //System.out.println( "lt:" + lt + " rt:" + rt + " lt값:"+ str.charAt(lt) + "rt값:" + str.charAt(rt));
//                    return "NO";
//                } else {
//                    lt++;
//                    rt--;
//                }
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(T.solution(str));
//    }
//}



// 강사님 풀이
import java.util.Scanner;

public class Main {
    String solution(String str) {
        String answer = "NO";
        // 빈칸이나 ,와 같은 기호들 제거!
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        // 거꾸로 뒤집었을때 똑같으면 answer를 YES로 바꾸기
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
