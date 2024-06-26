package com.java.eight8.datastructure.others;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 *
 */

public class removeDuplicateFromString {
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp_str = br.readLine();

        System.out.println("Actual string is: " + inp_str);
        System.out.println("String after removing duplicates: " + removeDuplicate(inp_str));

        br.close();
    }

    /**
     * This method produces a string after removing all the duplicate characters from input string and returns it
     * Example: Input String - "aabbbccccddddd"
     *          Output String - "abcd"
     * @param s String from which duplicate characters have to be removed
     * @return string with only unique characters
     */

    public static String removeDuplicate(String s) {
        if(s.isEmpty() || s == null) {
            return s;
        }

        StringBuilder sb = new StringBuilder("");
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (sb.toString().indexOf(s.charAt(i)) == -1) {
                sb.append(String.valueOf(s.charAt(i)));
            }
        }

        return sb.toString();
    }
}
