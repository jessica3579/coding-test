package org.example;

// 내 코드
//import java.util.Scanner;
//
//public class Main {
//    public int solution(int n, int k, int[] arr) {
//        int answer = 0, cnt = 0;
//        for (int i = 0; i < n; i++) if (arr[i] == 0) cnt++;
//        int[] a = new int[cnt + 1];
//        int tmp = 0;
////        for(int i=0; i<cnt+1; i++){
////            for(int j=0; j<n; j++){
////                if(arr[j] == 1) tmp++;
////                else {
////                    a[i] = tmp;
////                    tmp = 0;
////                    break;
////                }
////            }
////            System.out.println("i:" + i + "    a[i]:" + a[i] );
////        }
//        int index=0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i] == 1) tmp++;
//            else {
//                a[index] = tmp;
//                tmp = 0;
//                //System.out.println("index:" + index + "    a[index]:" + a[index]);
//                index++;
//            }
//        }
//        a[index] = tmp;
//        //System.out.println("index:" + index + "    a[index]:" + a[index]);
//
//        int sum = 0;
//        for(int i=0; i<k+1; i++){
//            sum += a[i];
//        }
//        answer = sum;
//        int lt = 0, rt = k+1;
//        while(rt < cnt+1){
//            sum += (a[rt++] - a[lt++]);
//            answer = Math.max(sum, answer);
//        }
//        answer += 2;
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//        System.out.println(T.solution(n, k, arr));
//    }
//}

// 강사님 코드
import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt] == 0) cnt++;
            while(cnt > k){
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, k, arr));
    }
}