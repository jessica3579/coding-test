package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//public class Main {
//    public String solution(String[] arr){
//        //String answer;
//        String[] answer = new String[arr.length];
//
//        for(int i=0; i<arr.length; i++){
//            //for(int j=0; j<arr[i].length(); j++){
//                // split으로 쪼개서 배열화 한 다음에 그걸 역행으로 넣기..!?
//                String[] wordArr = arr[i].split("");; // 한단어가 각각 쪼개짐
//                String[] back = arr[i].split("");
//                for(int j=0; j<arr[i].length(); j++){
//                    back[j] = wordArr[arr[i].length() - j - 1]; // back 배열에는 역순으로 들어ㅏㅁ
//                    //System.out.println(back[j]);
//                }
//                //answer[i] = Arrays.toString(back); // back 배열을 문자열 단어로!! -> 왜 안됨1.?
//                answer[i] = String.join("", back); // 구글링 한거!!!
//            //}
//        }
//        String a = "";
//        for(int i=0; i<answer.length; i++){
//            //a += answer[i] + "\n";
//            System.out.print(answer[i]);
//        }
//
//        return a;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String[] arr = new String[num];
//        for(int i=0; i<num; i++){
//            arr[i] = sc.next();
//        }
//
//        System.out.println(T.solution(arr));
//    }
//}


// 강사님 답변 1 - ArrayList, StringBuilder(x).reverse().toString() 이용
//public class Main {
//    public ArrayList<String> solution(int n, String[] arr){
//        ArrayList<String> answer = new ArrayList<>();
//
//        for(String x : arr){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String[] arr = new String[num];
//        for(int i=0; i<num; i++){
//            arr[i] = sc.next();
//        }
//        for(String x : T.solution(num, arr)){
//            System.out.println(x);
//        }
//
//    }
//}

// 강사님 답변 2 - 각 단어를 문자 배열로 바꿔서 reverse를 직접 구현!!
// ex) 0 인덱스<->4인덱스, 1인덱스<->3인덱스
public class Main {
    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x :arr){
            char[] s = x.toCharArray(); // x문자열이 char 배열화됨
            int lt = 0, rt = x.length()-1; // 첫번째 index와 단어의 마지막 index 지정
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // char 배열을 String으로 바꿔줌
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.next();
        }
        for (String x : T.solution(num, arr)) {
            System.out.println(x);
        }

    }
}