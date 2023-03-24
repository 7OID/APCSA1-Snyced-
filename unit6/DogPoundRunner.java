package unit6;

import java.util.ArrayList;

public class DogPoundRunner {
	
	public static void main(String[] args) {
		DogPound d = new DogPound();
		ArrayList<String> data = InputArrayList.createArrayList("dogs.txt");
		for(String s : data) {
			d.addDog(s);
		}
		System.out.println(d);
		System.out.println("number of dogs: " + d.getNumDogs());
		System.out.println("avg weight: " + d.getAverageWeight());
		System.out.println("oldest age: " + d.getOldestAge());
		int[] ratio = d.getGenderRatio();
		System.out.println(ratio[0] + " Males / " + ratio[1] + " Females");
	}
	
}