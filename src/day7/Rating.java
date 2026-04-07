package day7;

public class Rating {
	int userId;
	float rate;
	Rating(){
		System.out.println("Parent constuctor called");
	}
	
	
	void defaultRating() {
		rate=3.0f;
	}

	void defaultRating1() {
		System.out.println("Default Rating");
	}

}
