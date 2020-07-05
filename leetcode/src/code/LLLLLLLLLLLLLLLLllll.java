package code;

import java.util.HashMap;
import java.util.Map;

public class LLLLLLLLLLLLLLLLllll {
	
	 public static int getlastlength(String str){
	        int T=0;
	        if(str == null|| str.length()==0)
	        	return T;
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)!=' ')
	                T++;
	            else
	                T=0;
	        }
	        return T;
	    }

	public static void main(String[] args) {
		String s = "hello world werw wer wer wer wer w er wer  wer  we r w er w er we r w er w er werwerwerwerwerwer";
		System.out.println(getlastlength(s));
	}

}
