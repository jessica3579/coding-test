import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        char pScore;
        
        if(score >= 90 && score <= 100) pScore = 'A';
        else if(score >= 80 && score <= 89) pScore = 'B';
        else if(score >= 70 && score <= 79) pScore = 'C';
        else if(score >= 60 && score <= 69) pScore = 'D';
        else pScore = 'F';

        System.out.println(pScore);
    }
}