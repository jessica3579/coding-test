package org.example;

// 내 코드 -> 오답
//import java.util.*;
//
//import static java.util.Collections.reverseOrder;
//
//public class Main {
//    public int solution(int n, int m, ArrayList<Integer> arr){
//        int answer = 0, cnt = 0;
//        Queue<Integer> Q = new LinkedList<>();
//        for(int i=0; i<n; i++) Q.offer(arr.get(i));
//        Collections.sort(arr, reverseOrder());
//
//        while(cnt < m){
//            if(Q.peek().equals(arr.get(cnt))) {
//                Q.poll();
//                cnt++;
//                //System.out.println(t);
//            }
//            else{
//                Q.offer(Q.poll());
//            }
//        }
//        answer = cnt+1;
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        int[] a = new int[5];
////        for(int i=0; i<n; i++) a[i] = sc.nextInt();
//        for(int i=0; i<n; i++) arr.add(sc.nextInt());
//        System.out.println(T.solution(n, m, arr));
//    }
//}

// 강사님 코드
import java.util.*;

class Person{
    int id;
    int priority;
    Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    public int solution(int n, int m, int[] a){
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for(int i=0; i<n; i++) Q.offer(new Person(i, a[i]));

        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person x : Q){
                if(x.priority > tmp.priority){
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(m == tmp.id) return answer;
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
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        System.out.println(T.solution(n, m, a));
    }
}