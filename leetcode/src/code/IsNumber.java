package code;

public class IsNumber {
	
	public static boolean num(String number,int flat) {
		
		if(flat == 1) {
			for(char i:number.toCharArray())
				if(i<'0'||i>'9')
					return false;
			return true;
		}
		else {
			int t = 0;
			for(char i:number.toCharArray()) {
				if(i =='.') {
					t++;
					continue;
				}
				if(i<'0'||i>'9')
					return false;
			}
			
		   if(t>1) return false;
		   else if(number.length()==1&&t==1) return false;
		   else
		     return true;
		}
		
	}
	
	public static boolean solution(String str) {
		
		if(str==null||str==" "||str.length()==0) return false;
		
	   //else if() return false;
		String number_str = str.trim().toLowerCase() ;
	//	System.out.print(number_str);
		
		int index_e = number_str.indexOf('e');
		if(index_e!=-1) {
			
			if(index_e!=number_str.length()-1) {
				String head_str = number_str.substring(0, index_e);
				String tail_str = number_str.substring(index_e+1);
				boolean H = num(head_str.charAt(0)=='+'||head_str.charAt(0)=='-'?head_str.substring(1):head_str,0);
				boolean T = num(tail_str.charAt(0)=='+'||tail_str.charAt(0)=='-'?tail_str.substring(1):tail_str,1);
				return H&&T;
			}
			else   
				return false;
			
		}
		else 
			return  num(number_str.charAt(0)=='+'||number_str.charAt(0)=='-'?number_str.substring(1):number_str,0);
	}
	public static void main(String args[]) {
	
		String str = "";
		//System.out.println("       ".trim());
		if(solution(str))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
