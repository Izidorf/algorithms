
public class StringAlgos {

	
	
	public static void main(String[] args) {
		StringAlgos sa = new StringAlgos();
		
		char[] ch = "Izidor".toCharArray();
		
		System.out.println(ch);
		
		char[] ch2 = sa.reverseStringInPlace(ch);
		
		System.out.println(ch2);
		
		String s = sa.reverseBad("Izidor");
		System.out.println(s);
		
		char[] ch3 = sa.reverseAllWords("Hello my name is Izidor".toCharArray());
		
		System.out.println(ch3);
		
		String test = "abc";
		sa.permutation(test);
				
	}
	
	/* Complexity O(n)  */
	public String reverseBad(String string){
		String reversed = "";
		  for(int i = string.length() - 1; i >= 0; i--) {
		    reversed += string.charAt(i);
		  }
		  return reversed;
	}
	
	/*InPlace algorithm ..... does not use any additional memory */
	public char[] reverseStringInPlace(char[] string){
		for(int i=0, j=string.length-1; i<string.length/2; i++, j--){
			char c = string[i];
			string[i] = string[j];
			string[j]=c;
		}
		return string;
	}
	
	public char[] reverseAllWords(char[] in_text)
	{
	    int lindex = 0;
	    int rindex = in_text.length - 1;
	    if (rindex > 1)
	    {
	        //reverse complete phrase
	        in_text = ReverseString(in_text, 0, rindex);

	        //reverse each word in resultant reversed phrase
	        for (rindex = 0; rindex <= in_text.length; rindex++)
	        {
	            if (rindex == in_text.length || in_text[rindex] == ' ')
	            {
	                in_text = ReverseString(in_text,lindex, rindex - 1);
	                lindex = rindex + 1;
	            }
	        }
	    }
	    return in_text;
	}

	static char[] ReverseString(char[] intext, int lindex, int rindex)
	{
	    char tempc;
	    while (lindex < rindex)
	    {
	        tempc = intext[lindex];
	        intext[lindex++] = intext[rindex];
	        intext[rindex--] = tempc;
	    }
	    return intext;
	}
	
	public void permutation(String str) { 
	    permutation("", str); 
	}

	private void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
}
