package org.example;

// 내 코드
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Main {
//    public int solution(int n, int k){
//        int answer, cnt = 1;
//        Queue<Integer> queue = new LinkedList<>();
//        for(int i=1; i<=n; i++) queue.add(i);
//
//        while(queue.size() != 1){
//            if(cnt == k) {
//                queue.poll();
//                cnt = 1;
//                //System.out.println("remove " + a);
//            }
//            else{
//                cnt++;
//                int tmp = queue.poll();
//                queue.add(tmp);
//                //System.out.println("add " + tmp);
//            }
//        }
//        answer = queue.peek();
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        System.out.println(T.solution(n, k));
//    }
//}

// 강사님 코드
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int n, int k){
        int answer=0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i=1; i<=n; i++) Q.offer(i);

        while(!Q.isEmpty()){
            for(int i=1; i<k; i++) Q.offer(Q.poll());
            Q.poll();
            if(Q.size() == 1) answer = Q.poll();
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n, k));
    }
}