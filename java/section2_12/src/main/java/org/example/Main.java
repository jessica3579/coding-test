package org.example;

// 내 코드
//import java.util.Scanner;
//
//public class Main {
//    String solution(int a, String str) {
//        String answer = "";
//        String[] s = new String[a];
//        String[] binaryArr = new String[a];
//        int[] arr = new int[a];
//        for (int i = 0; i < a; i++) {
//            s[i] = str.substring(i * 7, (i + 1) * 7);
//            binaryArr[i] = ""; // 이렇게 해주면 밑에서 substring(4) 안해도 됨!!
//            for (int j = 0; j < 7; j++) {
//                if(s[i].charAt(j) == '#' ) binaryArr[i] += '1';
//                else binaryArr[i] += '0';
//            }
//            binaryArr[i] = binaryArr[i].substring(4);
//            arr[i] = Integer.parseInt(binaryArr[i], 2);
//            answer += (char)arr[i];
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        String str = sc.next();
//        System.out.println(T.solution(a, str));
//    }
//}

// 강사님 코드
import java.util.Scanner;

public class Main {
    String solution(int n, String str) {
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}