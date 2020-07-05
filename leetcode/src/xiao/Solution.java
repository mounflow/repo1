package xiao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Solution{
    public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            List<Character> list = new ArrayList();
            for(int i=0;i<str.length();i++)
                if(list.indexOf(str.charAt(i))<0)
                	list.add(str.charAt(i));
            System.out.print(list.size());
        }
        in.close();
     }
  }
