package hackerrank.simpleArraySum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author oguzhan.karacorlu on 8.02.2022
 * @project hackerrank
 */
public class SimpleArraySum {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int output=0;
        String[] input = br.readLine().split(" ");
        for(String value:input)
        {
            output += Integer.parseInt(value);
        }
        System.out.println(output);
    }
}
