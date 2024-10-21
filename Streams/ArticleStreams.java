package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticleStreams {
	public static List<Article> initializeArticleData(){
		
		List<Article> list = new ArrayList<Article>();
		
		TreeSet<String> cat1 = new TreeSet<>();
		cat1.add("Healthcare");
		cat1.add("Covid");
		Article a1 = new Article(101,  "healtcare", 2021, 860, cat1);

		TreeSet<String> cat2 = new TreeSet<>();
		cat2.add("Children");
		cat2.add("Education");
		Article a2 = new Article(102,  "Education", 2023, 1077, cat2);

		TreeSet<String> cat3 = new TreeSet<>();
		cat3.add("Women Empowerment");
		cat3.add("Education");
		Article a3 = new Article(103,  "Education", 2023, 950, cat3);
		
		TreeSet<String> cat4 = new TreeSet<>();
		cat4.add("Growth");
		cat4.add("Education");
		Article a4 = new Article(102,  "Education", 1999, 1800, cat4);
		TreeSet<String> cat5 = new TreeSet<>();
		cat5.add("Market");
		cat5.add("Stocks");
		Article a5 = new Article(102,  "Stock Market", 2020, 10900, cat5);
		TreeSet<String> cat6 = new TreeSet<>();
		cat6.add("children");
		cat6.add("education");
		Article a6 = new Article(102,  "Child education", 2024, 1507, cat6);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		
		
		return list;
	}
	
	public static void main(String [] args) {
		List<Article> list = initializeArticleData();
		Stream<Article> stream = list.stream();
		
		System.out.println("Filter by publishing year ");
		System.out.println("``````````````````````````");
		stream = list.parallelStream();
		List<Article> lstByYear = stream.filter((article)->article.getYearOfPublishing() == 2023).collect(Collectors.toList());
		for(Article a :lstByYear ) {
		System.out.println(a);
		}
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		System.out.println("List of articles with respect to subject :");
		System.out.println("``````````````````````````````````````````");
		stream = list.parallelStream();
		Map<String, List<Article>> subMap = stream.collect(Collectors.groupingBy(Article::getSubject, Collectors.toList()));

		for(String s:  subMap.keySet()) {
			System.out.println(s + " : " + subMap.get(s));
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		stream = list.parallelStream();
		System.out.println("Count by subject");
		System.out.println("`````````````````");
		Map<String, Long> countMap = stream.collect(Collectors.groupingBy(Article::getSubject, Collectors.counting()));
		System.out.println(countMap);
		System.out.println("-------------------------------------------------------------------------------------------------------");

		stream = list.stream();
		System.out.println("List of articles with more than 5k views");
		System.out.println("````````````````````````````````````````");
		stream.filter((n) ->  (n.getViews() > 5000)).forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------------------------------------");

		stream = list.parallelStream();
		System.out.println("Top 5 trending Articles");
		System.out.println("```````````````````````");
		List<Article> top5trending = stream.sorted((s1, s2) -> Integer.compare(s2.getViews(), s1.getViews())) // Sort in descending order
                .limit(5) // Limit to top 5
                .collect(Collectors.toList());
		for(Article a : top5trending ) {
			System.out.println(a);
		}
		System.out.println("-------------------------------------------------------------------------------------------------------");
		
		
	}
}
