package pubpriv.gwyn;

public class Soul {
	public String name; //I don't mind if people know my name
	String weakness; //same with weakness
	int age; //don't want others to know my age, but I want to know it...
	private String predestination; //this will never be seen by anyone!!
	
	public Soul(String name,String weakness,int age){
		this.name=name;
		this.weakness=weakness;
		this.age=age;
		this.predestination="Immortality through the preservation of your Lord Soul.";
	}
}
