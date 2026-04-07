package day7;

public class Program3_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookRating bookRating=new BookRating();
		bookRating.userId=101;
		bookRating.rate=4.5f;
		bookRating.doYouLike=true;	
		bookRating.defaultRating();
		System.out.println(bookRating.rate);
		bookRating.defaultRating1();

	}

}
