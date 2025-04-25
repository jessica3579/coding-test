package org.example;

// 내 코드
//import java.util.Scanner;
//
//public class Main {
//    public char[] solution(int n, int[] arr1, int[] arr2) {
//        char[] answer = new char[n];
//        for (int i = 0; i < n; i++) {
//            if (arr1[i] == 1) {
//                if (arr2[i] == 1) answer[i] = 'D';
//                else if (arr2[i] == 2) answer[i] = 'B';
//                else answer[i] = 'A';
//            } else if (arr1[i] == 2) {
//                if (arr2[i] == 1) answer[i] = 'A';
//                else if (arr2[i] == 2) answer[i] = 'D';
//                else answer[i] = 'B';
//            } else {
//                if (arr2[i] == 1) answer[i] = 'B';
//                else if (arr2[i] == 2) answer[i] = 'A';
//                else answer[i] = 'D';
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr1 = new int[n], arr2 = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            arr2[i] = sc.nextInt();
//        }
//        for (char x : T.solution(n, arr1, arr2))
//            System.out.println(x);
//    }
//}

// 강사님 코드
import java.util.Scanner;

public class Main {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";
        for(int i=0; i<n; i++){
            if(a[i] == b[i]) answer += "D";
            else if (a[i]==1 && b[i]==3) answer += "A";
            else if (a[i]==2 && b[i]==1) answer += "A";
            else if (a[i]==3 && b[i]==2) answer += "A";
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (char x : T.solution(n, a, b).toCharArray())
            System.out.println(x);
    }
}
