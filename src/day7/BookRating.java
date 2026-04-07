package day7;

public class BookRating extends Rating {
	boolean doYouLike;

	BookRating(){
		System.out.println("BookRating constuctor called");
	}
	
	void defaultRating() {
		rate=4.0f;
	}

	void defaultRating1() {
		System.out.println("Book Rating");
	}

	BookRating(int rating){
		System.out.println("Rating: " +rating);
	}
}
