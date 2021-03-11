package lab_4;

public abstract class Item {
	private int id;
	private String title;
	private int copiesNo;
	
	public Item() {
		super();
	}

	public Item(int id, String title, int copiesNo) {
		super();
		this.id = id;
		this.title = title;
		this.copiesNo = copiesNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopiesNo() {
		return copiesNo;
	}

	public void setCopiesNo(int copiesNo) {
		this.copiesNo = copiesNo;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", copiesNo=" + copiesNo + "]";
	}
	
	
	
	
}

abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(String author) {
		super();
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public WrittenItem() {
		super();
	}
	class Book extends WrittenItem {
		
		public Book() {
			super();
		}
		
		public Book(int id, String title, int copiesNo, String author) {
			this.setId(id);
			this.setTitle(title);
			this.setCopiesNo(copiesNo);
			this.setAuthor(author);
		}

		@Override
		public String toString() {
			return "Book [Author = " + getAuthor() + ", Title = " + getTitle() + ", Copies = " + getCopiesNo()
				    + "]";
		}
		
		
	}

	class JournalPaper extends WrittenItem {
		
		private int year;
		
		public JournalPaper() {
			super();
		}

		public JournalPaper(int id, String title, String author, int copiesNo, int year) {
			this.setId(id);
			this.setTitle(title);
			this.setCopiesNo(copiesNo);
			this.setAuthor(author);
			this.year = year;
		}
		
		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "JournalPaper [ Year = " + getYear() + ", Author = " + getAuthor() + ", Id = " + getId()
					+ ", Title = " + getTitle() + ", Copies = " + getCopiesNo() + "]";
		}
		
		
		
	}

	// 2nd Subclass 

	abstract class MediaItem extends Item {
		private int runTime;

		public int getRunTime() {
			return runTime;
		}

		public void setRunTime(int runTime) {
			this.runTime = runTime;
		}
	}

	class Video extends MediaItem {
		private String director;
		private String genre;
		private int year;
		
		public Video() {
			super();
		}

		public Video(String title,String director, String genre, int year, int runTime) {
			this.setTitle(title);
			this.setRunTime(runTime);
			this.director = director;
			this.genre = genre;
			this.year = year;
		}
		
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "Video [ Director = " + getDirector() + ", Genre = " + getGenre() + ", Year = " + getYear()
					+ ", RunTime = " + getRunTime() + "]";
		}
		
		
	}

	class CD extends MediaItem {
		private String artist;
		private String genre;
		
		public CD() {
			super();
		}
		
		public CD(String title, String artist, String genre, int runTime) {
			this.setTitle(title);
			this.setRunTime(runTime);
			this.artist = artist;
			this.genre = genre;
		}

		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}

		@Override
		public String toString() {
			return "CD [ Artist = " + getArtist() + ", Genre = " + getGenre() + ", RunTime = " + getRunTime()
					+ ", Title = " + getTitle() + "]";
		}
		
		
	}
	
	
}
