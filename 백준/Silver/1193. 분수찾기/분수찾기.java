import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int layer = 1;
        int max = 1;
        
        int top = 1;
        int bottom = 1;
        
        while(n > max){
            layer++;
            max += layer;
        }
       
        if(layer % 2 == 0) top = layer; else bottom = layer;
        
        while(max != n){
            max--;
            if(layer % 2 == 0){
                top--;
                bottom++;
            }else{
                top++;
                bottom--;
            }
        }
        
        System.out.println(top + "/" + bottom);
    }
}