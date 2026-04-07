package day7;
class Parent {
	String house;
}

class Child extends Parent{
	String car;
}

class GrandChild extends Child {
	String bicycle;
}

public class Program4_Multilevel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild grandChild = new GrandChild();
		grandChild.house="3BHK";
		grandChild.car="Creta";
		grandChild.bicycle="Hero";
		
		System.out.println(grandChild.house +"\n"+ grandChild.car +"\n"+grandChild.bicycle);
	Child child = new Child();
	child.car="maruti";
	child.house="4bhk";


	}

}
