package coding;
import java.util.*;
public class Parentheses_Validation {

		static boolean valid(String s)
		{
			if(s.length()%2!=0)
				return false;
			Stack<Character>stk=new Stack<Character>();
			for(char c:s.toCharArray())
				if(c=='('||c=='['||c=='{')
					stk.push(c);
				else if(c==')' && !stk.isEmpty() && stk.peek()=='(')
					stk.pop();
				else if(c==']' && !stk.isEmpty() && stk.peek()=='[')
					stk.pop();
				else if(c=='}' && !stk.isEmpty() && stk.peek()=='{')
					stk.pop();
			return stk.isEmpty();
			
		}
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		boolean test=valid(s);
		System.out.println(test);
	}

}

Input: [(])
Output:false
Input: ([])
Output: true
