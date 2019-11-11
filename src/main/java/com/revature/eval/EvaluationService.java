package com.revature.eval;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		// TODO Write an implementation for this method declaration
		String temp="";
		if(string!=null) {
			for(int i=string.length()-1;i>=0;i--) {
				temp+=string.charAt(i);
			}
		return temp;
		}
		return null;
	}

	
	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String Acronym="";
		if(phrase!=null) {
			Acronym+=phrase.charAt(0);
			for(int i=0; i< phrase.length();i++) {
				if(phrase.charAt(i)==' '||phrase.charAt(i)=='-') {
					Acronym+=phrase.charAt(i+1);
				}
			}
			return Acronym.toUpperCase();
		}
		return null;
	}
	
	
	/**
	 * 3. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		int total=0;
		string=string.toUpperCase();
//		if(string.charAt(index))
		Hashtable<Character,Integer> scores= new  Hashtable<Character,Integer>();
		scores.put('A', 1);
		scores.put('E', 1);
		scores.put('I', 1);
		scores.put('O', 1);
		scores.put('U', 1);
		scores.put('L', 1);
		scores.put('N', 1);
		scores.put('R', 1);
		scores.put('S', 1);
		scores.put('T', 1);
		scores.put('D', 2);
		scores.put('G', 2);
		scores.put('C', 3);
		scores.put('M', 3);
		scores.put('P', 3);
		scores.put('F', 4);
		scores.put('H', 4);
		scores.put('V', 4);
		scores.put('W', 4);
		scores.put('Y', 4);
		scores.put('K', 5);
		scores.put('J', 8);
		scores.put('X', 8);
		scores.put('Q', 10);
		scores.put('Z', 10);
		scores.put('B', 3);
		for(int i=0;i<string.length();i++) {
			if(scores.containsKey(string.charAt(i))) {
				total+=scores.get(string.charAt(i));
			}
		}
		return total;
	}
	
	
	/**
	 * 4. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return 
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		Map< String,Integer> hm = new HashMap< String,Integer>();
		
		String[] value= string.split(" ");
		
		for(int i=0;i<value.length;i++) {
			if(hm.containsKey(value[i])) {
				hm.put(value[i],hm.get(value[i])+1 );
			} else {
			hm.put(value[i], 1);
			}
		}
		return hm;
	}
	
	/**
	 * 5. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	
}
