package com.collection;
import java.util.TreeMap;

public class Collection_1 {
	Long phoneNumber;
    String name, email;
    String gender;
	public Collection_1(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "["+name+","+email+","+gender+"]";
	}
	static void output() {
	  // Creating an empty TreeMap
    TreeMap<Long, Collection_1> tree_map = new TreeMap<Long, Collection_1>();

    //Storing Contacts in Descending order
    tree_map.put(9890321604L, new Collection_1("Roshani", "@gmail","Female"));
    tree_map.put(9790321604L, new Collection_1("Pragati", "@gmail","Female"));
    tree_map.put(9690321604L, new Collection_1("Isika", "@gmail","Female"));
    tree_map.put(9590321604L, new Collection_1("Mayur", "@gmail","Male"));
    
    //Stored upon descending order of phone number
    System.out.println("1:Descending order as per Phone Numbers=\n"+tree_map.descendingMap());

    // Printing the elements of TreeMap
    System.out.println("\nAll the Keys :"+ tree_map.keySet());
    System.out.println("\nAll the Values :"+ tree_map.values());
    System.out.println("\nKeys and Value pairs: " + tree_map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        output();
	}

}
