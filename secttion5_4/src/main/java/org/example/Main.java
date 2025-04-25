package org.example;

// 내 코드 -> 오답
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Main {
//    public int solution(String str1, String str2){
//        int answer = 0, cnt = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(int i=0; i<str2.length()-1; i++){
//            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
//        }
//
//        int lt = 0;
//
//        for(int rt=str2.length()-1; rt<str1.length(); rt++){
//            map.put(str1.charAt(rt), map.getOrDefault(str1.charAt(rt), 0) + 1);
//
//            for(int j=0; j<str2.length(); j++){
//                if(map.containsKey(str2.charAt(j))) cnt++;
//            }
//            if(cnt == str2.length()) answer++;
//            cnt=0;
//
//            map.put(str1.charAt(lt), map.get(str1.charAt(lt)) - 1);
//            if(map.get(str1.charAt(lt)) == 0) map.remove(str1.charAt(lt));
//            lt++;
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        System.out.println(T.solution(str1, str2));
//    }
//}

// 내꺼 수정한거 코드
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Main {
//    public int solution(String str1, String str2){
//        int answer = 0, cnt = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(int i=0; i<str2.length()-1; i++){
//            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
//        }
//
//        int lt = 0;
//
//        for(int rt=str2.length()-1; rt<str1.length(); rt++){
//            map.put(str1.charAt(rt), map.getOrDefault(str1.charAt(rt), 0) + 1);
//
//            HashMap<Character, Integer> temp = new HashMap<>(map);
//
//            for(char x : str2.toCharArray()){
//                if(temp.containsKey(x) && temp.get(x) != 0) {
//                    cnt++;
//                    temp.put(x, temp.get(x) -1);
//                }
//            }
//
//            if(cnt == str2.length()) answer++;
//            cnt =0;
//
////            for(int j=0; j<str2.length(); j++){
////                if(map.containsKey(str2.charAt(j))) cnt++;
////            }
////            if(cnt == str2.length()) answer++;
////            cnt=0;
//
//            map.put(str1.charAt(lt), map.get(str1.charAt(lt)) - 1);
//            if(map.get(str1.charAt(lt)) == 0) map.remove(str1.charAt(lt));
//            lt++;
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        System.out.println(T.solution(str1, str2));
//    }
//}

// 강사님 코드
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int solution(String a, String b){
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);

        int L = b.length() -1;
        for(int i=0; i<L; i++){
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int rt=L; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);

            if(am.equals(bm)) answer++;

            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if(am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(T.solution(str1, str2));
    }
}