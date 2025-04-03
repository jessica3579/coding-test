package org.example;

// 내 코드 -> 망
//import java.util.Scanner;
//
//public class Main {
//    public int solution(int n){
//        int answer = 1; // 2 포함!!
//        // 소수의 갯수를 구하는거라... 소수를 직접 구해야하는거 아냐...?
//        // 갯수 구하는거에 규칙이 있나..? 있을리는 없음.. 소수니까...
//
//        for(int i=3; i<=n; i++){
//            int a =0;
//            for(int j=2; j<i/2 +1; j++){
//                if(i % j == 0) a = 1;
//            }
//            if(a == 0) answer++;
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(T.solution(n));
//    }
//}

// 강사님 코드
import java.util.Scanner;

public class Main {
    public int solution(int n){
        int answer = 0;
        int[] a = new int[n+1];
        for(int i=2; i<=n; i++){
            if(a[i]==0){
                answer++;
                for(int j=i; j<=n; j+=i) a[j] = 1;

            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}