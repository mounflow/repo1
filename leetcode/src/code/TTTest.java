package code;

public class TTTest {

	public static boolean solution(String s, String p) {
		
		if(s.length()==0)
		{
			if(p.length()%2!=0) return false;
			int i = 1;
			while(i<p.length()){
				if(p.charAt(i)!='*') return false;
				i+=2;
			}
		 return true;	
		}
		if(p.length()==0) return false;
		char c1 = s.charAt(0), c2 = p.charAt(0),c3 = 'a';
		if(p.length()>1)
			c3 = p.charAt(1);
		if(c3 != '*') {
			if(c1 == c2 || c2 == '.')
				return solution(s.substring(1),p.substring(1));
			else return false;
		}
		else {
			if(c1 == c2 || c2 == '.')
				return solution(s.substring(1),p);
			else
				return solution(s,p.substring(2));
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println(solution("123","1.3"));
	}
}
