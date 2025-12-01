import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line;
        while((line = br.readLine()) != null){
            if(line.isEmpty()) continue;
            
            StringTokenizer st = new StringTokenizer(line);
            
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            
            bw.write(String.valueOf(one + two));
            bw.newLine();
        }
        
        bw.flush();
    }
}