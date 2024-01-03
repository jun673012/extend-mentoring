import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        int q = x/3600;
        int p = (x%3600)/60;
        int k = (x%3600)%60;

        if ((S+k)<60){
            S+=k;
            if((M+p)<60){
                M=M+p;
                if((H+q)<24){
                    H+=q;
                } else{
                    if((H+q)%24<24){
                        H=(H+q)%24;
                    } else{
                        H=(H+q)%24-24;
                    }

                }
            } else{
                M=(M+p)%60;
                if((H+q+1)<24){
                    H=H+q+1;
                } else{
                    H=(H+q+1)%24;
                }
            }
        } else{
            if((S+k)%60<60){
                S=(S+k)%60;
            } else{
                S=(S+k)%60-60;
            }

            if((M+p+1)<60){
                M=M+p+1;
                if((H+q)<24){
                    H+=q;
                } else{
                    H=(H+q)%24;
                }
            } else{
                if((M+p+1)%60<60){
                    M=(M+p+1)%60;
                }else{
                    M=(M+p+1)%60-60;
                }

                if((H+q+1)<24){
                    H=H+q+1;
                } else{
                    if((H+q+1)%24<24){
                        H=(H+q+1)%24;
                    } else{
                        H=(H+q+1)%24-24;
                    }
                }
                }
            }
        System.out.printf("%d %d %d",H,M,S);
    }
}
