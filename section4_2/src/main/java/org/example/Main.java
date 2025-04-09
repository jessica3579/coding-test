package org.example;

// 내 코드 -> time limit exceeded ㅜㅠㅜㅠㅜㅠ
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
//        ArrayList<Integer> answer = new ArrayList<Integer>();
//        int min = Integer.MAX_VALUE;
//        int p1 = 0, p2 = 0, cnt = 0;
////        for(int i=0; i<n; i++){
////            for(int j=0; j<m; j++){
////                if(a[i] == b[j]) {
////                    answer.add(a[i]);
////                    break;
////                }
////            }
////        }
//        // 아니면 while문으로?
//        while (p1 < n && p2 < m) {
//            if (a[p1] == b[p2]) {
//                answer.add(a[p1++]);
//                cnt++;
//                p2 = 0;
//                //System.out.println(" if문 안 a[p1] : " + a[p1] + " b[p2] : " + b[p2] );
//            } else {
//                p2++;
//                if (p2 == m) {
//                    p2 = 0;
//                    p1++;
//                }
//                //System.out.println("else 문 안 a[p1] : " + a[p1] + " b[p2] : " + b[p2] );
//            }
//        }
//
//        // 오름차순을 어떻게 해야하는지 모르겠움
//        for (int i = 0; i < answer.size(); i++) {
//            for (int j = 0; j < answer.size()-1; j++) {
//                if (answer.get(j) > answer.get(j + 1)) {
//                    int tmp = answer.get(j);
//                    answer.set(j, answer.get(j + 1));
//                    answer.set(j+1, tmp);
//                }
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int m = sc.nextInt();
//        int[] b = new int[m];
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//        }
//        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
//
//    }
//}


// 강사님 코드
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0, p2=0;
        while( p1<n && p2<m ){
            if(a[p1] == b[p2]){
                answer.add(a[p1++]);
                p2++;
            } else if ( a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }
}
