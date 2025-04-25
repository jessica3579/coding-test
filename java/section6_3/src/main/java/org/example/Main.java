package org.example;

// 내 코드
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//    public int solution(int n, int[][] board, int m, int[] moves){
//        int answer = 0;
//        Stack<Integer> basket = new Stack<>();
//        basket.push(0);
//
//        for(int i=0; i<m; i++){
//            for(int j=1; j<=n; j++){
//                if(board[j][moves[i]] != 0) {
//                    // basket에 넣기 전에 이전과 같으면.. 이전걸 pop하고
//                    // answer을 2 증가..
//                    if(basket.peek() == board[j][moves[i]]){
//                        answer += 2;
//                        basket.pop();
//                    }else basket.push(board[j][moves[i]]);
//                    board[j][moves[i]] = 0;
//                    break;
//                }
//            }
//        }
//
//        return answer;
//    }
//    public static void main(String[] args) {
//        Main T = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] board = new int[n+1][n+1];
//        for(int i=1; i<=n; i++)
//            for(int j=1; j<=n; j++)
//                board[i][j] = sc.nextInt();
//        int m = sc.nextInt();
//        int[] moves = new int[m];
//        for(int i=0; i<m; i++) moves[i] = sc.nextInt();
//        System.out.println(T.solution(n, board, m, moves));
//    }
//}

// 강사님 코드
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!basket.isEmpty() && tmp == basket.peek()){
                        answer += 2;
                        basket.pop();
                    } else basket.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                board[i][j] = sc.nextInt();
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++) moves[i] = sc.nextInt();
        System.out.println(T.solution(board, moves));
    }
}