package org.example;

/*import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] a) {
        int answer = 0, sum = a[0], w = 1, cnt = 1;
//        for (int i = 1; i < n; i++) {
//            if (sum == m) {
//                System.out.println("1  i : " + i + " sum : " + sum);
//                answer++;
//                sum += (a[i] - a[i - w]);
//            } else if (sum < m) {
//                System.out.println("2  i : " + i + " sum : " + sum);
//                sum += a[i];
//                w++;
//            } else {
//                System.out.println("3  i : " + i + " sum : " + sum);
//                sum -= a[i - w];
//                w--;
//            }
//        }
        while (cnt < n) {
            if (sum == m) {
                //System.out.println("1  cnt : " + cnt + " sum : " + sum);
                answer++;
                sum += a[cnt];
                w++;
                //sum += (a[cnt] - a[cnt - w]);
                cnt++;
            } else if (sum < m) {
                //System.out.println("2  cnt : " + cnt + " sum : " + sum);
                sum += a[cnt];
                w++;
                cnt++;
            } else {
                //System.out.println("3  cnt : " + cnt + " sum : " + sum);
                sum -= a[cnt - w];
                w--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(T.solution(n, m, a));
    }
}*/

// 강사님 풀이
import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] a) {
        int answer=0, sum = 0, lt = 0;

        for(int rt = 0; rt < n; rt++){
            sum += a[rt];

            while(sum > m){
                sum -= a[lt++];
            }

            if(sum == m) answer++;

        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(T.solution(n, m, a));
    }
}