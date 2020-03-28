import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        //char st=new char[n];
        String x="";
        long count=0l;

        int l=s.length();
        int m=(int)(n/l);

        for(int i=1;i<=m;i++)
        x=x.concat(s);
		System.out.println(x);
		
        int rem=(int)(n-l*m);
		System.out.println("rem lenght"+rem);
		
        for(int i=0;i<rem;i++)
        x=x+s.charAt(i);

        for(int i=0;i<n;i++)
        {
            if(x.charAt(i)=='a')
            count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
		System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
    }
}
