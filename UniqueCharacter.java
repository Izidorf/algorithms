import java.util.*;


public class UniqueCharacter {
	
	
	public static void main(String[] args) {
		char[] c = "izziziiziziazizizizizizicziziziizdizizizizizibziiz".toCharArray();
		
		UniqueCharacter uc = new UniqueCharacter();
		char c1 = uc.nonUniqueChar(c);
		
		System.out.print(c1);
		
	}
	
	public char nonUniqueChar(char[] arr){
		Set<Character> seen = new HashSet<Character>();
		for(char c : arr)
			if(!(seen.contains(c)))
				seen.add(c);
			else
				return c;
		
		return (Character) null;
	}
	

}
