/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique.problem;

/**
 *
 * @author ITCLANBD
 */
public class STRONGEST_PALINDROME {

    public String FIND_PALINDROME(String s) {
        if (s.isEmpty()) {
            return null;
        }

        if (s.length() == 1) {
            return s;
        }

        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String tmp = FIND(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
            tmp = FIND(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }

        return longest;
    }

    public String FIND(String s, int start, int end) {
        while (start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }

    public String FIND_LONGEST_PALINDROME(String s) {
        String retStr = s.substring(0, 1);
        int n = s.length();
        for (int i = 0; i < n; i++) {
            String temp;
            temp = PALINDROME(s, i, i);
            if (temp != null && temp.length() > retStr.length()) {
                retStr = temp;
            }
            temp = PALINDROME(s, i, i + 1);
            if (temp != null && temp.length() > retStr.length()) {
                retStr = temp;
            }
        }
        return retStr;
    }
    String PALINDROME(String s, int low, int high) {
        String ret = "";
        boolean palFound = false;

        /* check for string palindrome starting from
	  * low index to high keeping array boundaries between 0 to n-1 */
        while (low >= 0 && high < s.length()) {
            /* break the loop if any of the element do not matches */
            if (s.charAt(low) != s.charAt(high)) {
                break;
            }

            /* if we have reached here means, atleast one of the element is palindrome */
            palFound = true;

            /* increase  high index, decrease low index */
            low--;
            high++;
        }

        /* if palindrome found then return the sub string after adjusting the low and high indexes */
        if (palFound == true) {
            low++;
            high--;
            ret = s.substring(low, high + 1);
        }

        /* returns string we got from low to high */
        return (ret);
    }
}
