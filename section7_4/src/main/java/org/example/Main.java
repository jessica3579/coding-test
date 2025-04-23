package org.example;

// 내 코드
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Main {
//    public HashMap<Boolean, Integer> isExist(int[] arr, int x){
//        HashMap<Boolean, Integer> result = new HashMap<>();
//        result.put(false, -1);
//        // 있으면 true로 바꾸기
//        //System.out.println("x출력" + x);
//        for(int i=0; i< arr.length; i++){
//            //System.out.println("함수 안 - arr" + arr[i]);
//            if(x == arr[i]){
//                result.put(true, i);
//                break;
//            }
//        }
//        return result;
//    }
//
//    public int[] solution(int s, int n, int[] arr){
//        int[] answer = new int[s];
//        for(int i=0; i<n; i++){
//            // 존재하지 않으면 값 미루고 앞에 하나 넣으면 됨
//            HashMap<Boolean, Integer> result = isExist(answer, arr[i]);
//            if(!result.containsKey(true)) {
//                //System.out.println("if문");
//                for(int j=s-1; j>=1; j--){
//                    answer[j] = answer[j-1];
//                    //System.out.println("if - i : " + i + " answer : " + answer[j]);
//                    //System.out.println(arr[i]);
//                }
//            }else{
//                // 존재한다면.. 밀고 해당 숫자를 앞으로 가져와야함
//                int idx = result.get(true);
//                //System.out.println("else문 idx" + idx);
//                for(int j=idx; j>=1; j--){
//                    answer[j] = answer[j-1];
//                    //System.out.println("else - i : " + i + "answer : " + answer[j]);
//                    //System.out.println(arr[i]);
//                }
//            }
//            answer[0] = arr[i];
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt(); // 캐시 사이즈
//        int n = sc.nextInt(); // 작업의 개수
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//        for(int x : T.solution(s, n, arr)) System.out.print(x + " ");
//    }
//}

// 강사님 코드
import java.util.Scanner;

public class Main {
    public int[] solution(int size, int n, int[] arr){
        int[] cache = new int[size];
        for(int x : arr){
            int pos = -1;
            for(int i=0; i<size; i++) if(cache[i] == x) pos = i;
            if(pos == -1){
                for(int i=size-1; i>=1; i--) cache[i] = cache[i-1];
            }else {
                for(int i=pos; i>=1; i--) cache[i] = cache[i-1];
            }
            cache[0] = x;
        }
        return cache;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // 캐시 사이즈
        int n = sc.nextInt(); // 작업의 개수
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }
}