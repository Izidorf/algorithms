import java.util.*;


public class Intersection {
	
	public static void main(String[] args) {
		Intersection i = new Intersection();
		
		char[] arr1 = {'a', 'b', 'c', 'd', 'e'};
		char[] arr2 = {'a', 'c', 'd', 'f'};
		
		i.intersection(arr1, arr2);
		
	}
	
	//complexity O(n) or O(n^x), where x is 1 < x < 2 if hashing function is bad
	public Set<Character> intersection(char[] a1, char[] a2){
		Set<Character> s = new HashSet<Character>();
		
		for(char c1 : a1)
			s.add(c1);
		
		for(int i=0; i<a2.length; i++)
			if(s.contains(a2[i]))
				System.out.println();
		
		return null;
		
	}
	

}
