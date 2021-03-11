package lab_4;

public class Exercise3 {
	public static void main(String[] args) {
		Book b1 = new Book(101, "Java", 15, "Kevin");
		JournalPaper jp1 = new JournalPaper(105, "AI", "Robert", 15, 2020);
		
		System.out.println(b1.toString());
		System.out.println(jp1.toString());
		
		Video v1 = new Video("Batman", "C. Nolan", "Action", 2005, 124);
		CD cd1 = new CD("I'm Down", "The Beatles", "Pop", 17);
		
		System.out.println(v1.toString());
		System.out.println(cd1.toString());
		
	}

}