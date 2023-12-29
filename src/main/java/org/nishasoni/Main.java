package org.nishasoni;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("///////Palindrom///////////String And Number////////////");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            rev+=c;
        }
        if(s.equals(rev)){
            System.out.print("YES");
            return;
        }
        else{
            System.out.print("NO");
        }
    }

}