package com.bridgelabz.programs;

public class BusinessCode {
	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		String s1="to be or not to be";  
		String[] words=s1.split("\\s");
		for(String w:words){  
			hashTable.add(w);
		}  
		hashTable.print();
		
		HashTable hashTable1 = new HashTable();
		String s2 = "paranoids are not paranoid because they are paranoid but because they keep putting themselves"+
					" deliberately into paranoid avoidable situations";
		String [] split = s2.split("\\s");
		for (String word : split) {
			hashTable1.add(word);
		}
		hashTable1.print();
	}
}
