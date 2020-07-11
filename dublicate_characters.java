package sorting;

public class dublicate_characters {

	public static void main(String[] args) {
		
	  String str = "kmmkw3schools";
	  int cnt = 0;
	  int k=0;
	  char inp[] = str.toCharArray();
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < inp.length; i++) {
	   for (int j = i + 1; j < inp.length; j++) {
	    if (inp[i]==(inp[j])) {
	    	
	     System.out.println(inp[i]);
	     
	   
	    }
	   }
	  }
	 }
}
	