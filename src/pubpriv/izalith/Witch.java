package pubpriv.izalith;

import pubpriv.gwyn.Soul;

public class Witch {

	 public static Soul soul;
		
	 public static void main(String[] args) {
		 create();
		System.out.println("Active Soul: "+soul.name);
		

	}
	
	private static void create(){
		soul=new Soul("witch of izalith","hubris",850);
		
	}

}
