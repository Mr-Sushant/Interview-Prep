import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Valley {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int trans=0,count=0,flag=0;
        int i=0;
        while(i<n)
        {
            char c=s.charAt(i);
            if(c=='D')
            count--;
            if(c=='U')
            count++;
            if(count==-1&&flag==0)
            {
                flag=1;
                trans++;
            }
            else if(count==0&&flag==1)
                flag=0;
			i++;
        }
        return trans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
		System.out.println(result);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}
