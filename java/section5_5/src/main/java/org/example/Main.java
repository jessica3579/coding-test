package org.example;

// 내 시도 -> 실패
//import java.util.*;
//
//public class Main {
//    public int solution(int n, int k, int[] arr){
//        int answer = 0;
//        HashSet<Integer> set = new HashSet();
//        if( n * (n-1) * (n-2) / 6 < k ) return -1;
//        else {
//            for(int i=0; i<n; i++){
//                for(int j=1; j<n; j++){
//                    for(int l=2; l<n; l++){
//
//                        set.add(arr[i] + arr[j] + arr[l]);
//                        System.out.println(arr[i]  + " "  + arr[j] + " " + arr[l]);
//                    }
//                }
//            }
//        }
//        List<Integer> tempSet = new ArrayList<>(set);
//        Collections.sort(tempSet, Collections.reverseOrder());
//        answer = tempSet.get(k);
//
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//        System.out.println(T.solution(n, k, arr));
//    }
//}

// 강사님 코드
import java.util.*;

public class Main {
    public int solution(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt == k) return x;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, k, arr));
    }
}