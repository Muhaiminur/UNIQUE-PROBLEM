/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique.problem;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ITCLANBD
 */
public class PALINDROME {
    public static HashSet<String> h = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        STRONGEST_PALINDROME t=new STRONGEST_PALINDROME();
        
        //System.out.print(t.FIND_PALINDROME(s));
        System.out.print(t.FIND_LONGEST_PALINDROME(s));
    }
}