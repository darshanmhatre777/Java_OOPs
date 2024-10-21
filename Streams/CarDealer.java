package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CarDealer {
	public static List<Car> initializeCarData(){
		List<Car> cars = new ArrayList<>();
		TreeSet<String> c1 = new TreeSet<>();
		c1.add("Blue");
		c1.add("White");
		Car v1 = new Car(1001, "Rolls Royce", "Ghost", 2023, 500, c1);

		TreeSet<String> c2 = new TreeSet<>();
		c2.add("Red");
		c2.add("Black");
		Car v2 = new Car(1002, "Hyundai", "i20", 2016, 8, c2);

		TreeSet<String> c3 = new TreeSet<>();
		c3.add("White");
		c3.add("Grey");
		Car v3 = new Car(1003, "Wolkswagon","Polo", 2015, 7.5 ,c3);
		
		TreeSet<String> c4 = new TreeSet<>();
		c4.add("Yellow");
		c4.add("Red");
		Car v4 = new Car(1004, "Porche", "Cayman S ", 2022, 80, c4);
		
		TreeSet<String> c5 = new TreeSet<>();
		c5.add("Black");
		c5.add("White");
		Car v5 = new Car(1005,"lamborghini", "Aventador", 2019, 300, c5);
		
		TreeSet<String> c6 = new TreeSet<>();
		c6.add("Stone-Black");
		Car v6 = new Car(1006,"Mahindra", "Thar", 2022, 15,c6);

		TreeSet<String> c7 = new TreeSet<>();
		c7.add("DarkBlue");
		Car v7 = new Car(1007, "Hyundai", "Venue", 2024, 8, c7);
		
		TreeSet<String> c8 = new TreeSet<>();
		c8.add("White");
		Car v8 = new Car(1002, "Hyundai", "i20", 2016, 8, c8);
		
		TreeSet<String> c9 = new TreeSet<>();
		c9.add("Black");
		Car v9 = new Car(1005,"lamborghini", "Urus", 2024, 300, c9);

		cars.add(v1);
		cars.add(v2);
		cars.add(v3);
		cars.add(v4);
		cars.add(v5);
		cars.add(v6);
		cars.add(v7);
		cars.add(v8);
		cars.add(v9);
		return cars;
	}
	int count = 0;
	void counter() {
		count++;
	}
	public static void main(String[] args) {
		List<Car> cars = initializeCarData();
		Stream<Car> stream = cars.stream();

		System.out.println("Stock of cars according for specific model and colors :");
		System.out.println("`````````````````````````````````````````````````````````");
		stream.filter((car)->car.getColours().contains("White")).filter((car) -> car.getModel().contains("Ghost")).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		stream =cars.stream();
		System.out.println("Group the data by model : ");
		System.out.println("``````````````````````````");
		Map<String, List<Car>> grpByModel = stream.collect(Collectors.groupingBy(Car::getModel, Collectors.toList()));
		for(String key : grpByModel.keySet()) {
			System.out.println(key + " : " + grpByModel.get(key));
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("Count no of cars per model : ");
		System.out.println("`````````````````````````````");
		stream = cars.stream();
		Map<String, Long> countByModel= stream.collect(Collectors.groupingBy(Car::getModel, Collectors.counting()));
		for(String key : countByModel.keySet()) {
			System.out.println(key + " : " + countByModel.get(key));
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("Sort by price in ascending order :");
		System.out.println("```````````````````````````````````");
		stream = cars.stream();
		List<Car> sortByPrice = stream.sorted((s1, s2) -> Double.compare(s1.getPrice(), s2.getPrice())).collect(Collectors.toList());
		for(Car vehicle : sortByPrice ) {
			System.out.println(vehicle);
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");

		stream =cars.stream();
		System.out.println("Old stock of car : ");
		System.out.println("```````````````````");
		stream.filter((n) -> n.getMan_year()<2020).forEach(System.out::println);

		System.out.println("---------------------------------------------------------------------------------------------------");

		System.out.println("Most Expensive Car : ");
		System.out.println("``````````````````````");
		System.out.println(sortByPrice.get(sortByPrice.size()-1));
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("Least Expensive Car : ");
		System.out.println("```````````````````````");
		System.out.println(sortByPrice.get(0));
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
	}
}
