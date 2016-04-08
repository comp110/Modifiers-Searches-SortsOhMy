package pubpriv.gwyn;

import pubpriv.izalith.Witch;
import java.math.*;


public class lordOfCinders {
	 static Soul soul;
	 private double _instancevar=Math.random(); //random is a static method of Math
	
	 public static void main(String[] args) {
		 create();
		System.out.println("Active Soul: "+soul.name); //this can be accessed
		

	}
	
	private static void create(){
		soul=new Soul("gywn, lord of cinders","Fire, Magic, and Occult",999);
		
	}

}
