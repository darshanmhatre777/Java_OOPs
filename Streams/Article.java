package assignment3;

import java.util.TreeSet;

public class Article {
	private int srno;
	private String subject;
	private int yearOfPublishing;
	private int views;
	private TreeSet<String> category;
	public Article(int srno, String subject, int yearOfPublishing, int views, TreeSet<String> category) {
		super();
		this.srno = srno;
		this.subject = subject;
		this.yearOfPublishing = yearOfPublishing;
		this.views = views;
		this.category = category;
	}
	
	public int getSrno() {
		return srno;
	}

	public String getSubject() {
		return subject;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public int getViews() {
		return views;
	}

	public TreeSet<String> getCategory() {
		return category;
	}
	
	@Override
	public String toString() {
		return "Article [srno=" + srno + ", subject=" + subject + ", yearOfPublishing=" + yearOfPublishing + ", views="
				+ views + ", category=" + category + "]";
	}

}
