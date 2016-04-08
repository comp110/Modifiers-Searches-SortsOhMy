package searchingsorting;

import java.util.ArrayList;
import java.util.Random;

public class search {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		setup();
		printList(list);
		InsertionSort(list);
		bsearch(26, list);
		//now do what you will...

	}
	
	public static void setup(){
	/*	Random R = new Random();
		int i=0;
		while(i<100000){
		list.add(R.nextInt(50000));
		i++;
		}*/ //using for timing demonstration
		
		list.add(10);
		list.add(4);
		list.add(2);
		list.add(11);
		list.add(8);
		list.add(0);
		list.add(13);
		list.add(42);
		list.add(26);
		list.add(1);
		list.add(7);
		list.add(6);
	}
	
	
	
	
	
	//Sorts
	
	public static void InsertionSort(ArrayList<Integer> l){
		for (int i = 1; i < l.size(); i++) {
			int valueToSort = l.get(i);
			int j = i;
			while (j > 0 && l.get(j-1) > valueToSort) {
				l.set(j, l.get(j-1));
				j--;
			}
			l.set(j, valueToSort);
		}
	}
	
	
	private static void swap(ArrayList<Integer> l, int i, int j) {
        int temp = l.get(i);
        l.set(i, l.get(j));
        l.set(j, temp);
    }
	
	public static void SelectionSort(ArrayList<Integer> l){
		 for (int i = 0; i < l.size() - 1; i++) {
	            // Find the index of the minimum value
	            int minPos = i;
	            for (int j = i + 1; j < l.size(); j++) {
	                if (l.get(j) < l.get(minPos)) {
	                    minPos = j;
	                }
	            }
	            swap(list, minPos, i);
		 }
	}
	
	
	
	
	
	//Searches
	
	static int lsearch(int toFind, ArrayList<Integer> l){ //will give back index we found toFind at, otherwise return -1...
		for(int i=0;i<l.size();i++){
			if(l.get(i)==toFind){
				System.out.println("found "+ toFind+" after "+i+ " iterations");
				return i;
			}
		}
		return -1;
	}
	
	static int bsearch(int toFind,ArrayList<Integer> l){//assuming list is pre-sorted
		int hi=l.size();
		int lo=0;
		int i=0;
		while(lo <= hi){
			int mid= lo + (hi - lo) / 2; //avoiding integer overflow!!
			if(toFind < l.get(mid)){
				hi=mid-1;
			}
			else if(toFind > l.get(mid)){
				lo=mid+1;
			}
			else{
				System.out.println("found "+ toFind+" after "+i+ " iterations");
				return mid;
			}
			i++;//for keeping track of timing.....
		}
		return -1;
	}

	
	
	//printing

	public static void printList(ArrayList<Integer> l){
		System.out.println("Beginning to print list.");
		for (Integer integer : l) {
			System.out.println(integer);
		}
		System.out.println("Done printing list.");
	}
	
	
	
}



