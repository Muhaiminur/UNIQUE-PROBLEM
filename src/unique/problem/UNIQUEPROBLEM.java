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
public class UNIQUEPROBLEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "12343215467";
        UNIQUEPROBLEM p = new UNIQUEPROBLEM();
        char[] c = s.toCharArray();
        System.out.print("Length of longest seq is" + p.lps(c,0,c.length-1)); 
    }
    int max(int x , int y)
    {
        return (x>y)? x:y;  
    }

    int lps(char[] a ,int i , int j)
    {
        if(i==j) //If only 1 letter
        {
            return 1;
        }
        if(a[i] == a[j] && (i+1) == j) // if there are 2 character and both are equal
        {
            return 2;   
        }
        if(a[i] == a[j]) // If first and last char are equal
        {
            return lps(a , i+1 , j-1) +2;
        }
        return max(lps(a,i+1 ,j),lps(a,i,j-1)); 
    }
}
