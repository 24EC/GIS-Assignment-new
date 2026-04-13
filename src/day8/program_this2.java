package day8;

class UserG{
	int id;
	String name;
	UserG(){
	System.out.println("constructor 1 called ");
	}
	
	UserG(int id, String name){
		this();
		this.id = id;
		this.name = name;
		System.out.println("constructor 2 called ");
		}
	void print() {
		System.out.println(this.id+":"+this.name);
	}
}
public class program_this2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		UserG obj =new UserG(101, "Rajat");
		obj.print();
		

	}

}
