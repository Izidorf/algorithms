import java.util.*;


public class Lists {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("1");
		
		List2 list6 = new List2(list);
		
		list6.add("2");
		list6.add("3");
		
		//list6.printList();
		
		//list.clear();
		
		//list6.printList();
		list6.clearList();
		
		for(String s: list)
			System.out.println(s);
		
		
		
		
	}
	
	
	

}

class List2 {
	
	ArrayList<String> myList;
	
	public List2(ArrayList<String> list){
		myList= new ArrayList<String>(list);
	}
	
	
	public void printList(){
		for(String s : myList)
			System.out.println(s);
	}
	
	public void clearList(){
		this.myList.clear();
	}
	
	public void add(String e){
		this.myList.add(e);
	}
	
}
