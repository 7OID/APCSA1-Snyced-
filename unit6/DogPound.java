package unit6;

import java.util.ArrayList;

public class DogPound {
	private ArrayList<Dog> dogs;
	
	public DogPound() {
		dogs = new ArrayList<Dog>();
	}
	public void addDog(String data) {
		dogs.add(new Dog(data));
	}
	public int getNumDogs() {
		return dogs.size();
	}
	public double getAverageWeight() {
		double total = 0;
		for(int i = 0; i < dogs.size(); i++) {
			total += dogs.get(i).getWeight();
		}
		return total / dogs.size();
	}
	public int getOldestAge() {
		int max = -1;
		for(int i = 0; i < dogs.size(); i++) {
			if(max < dogs.get(i).getAge())
				max = dogs.get(i).getAge();
		}
		return max;
	}
	public int[] getGenderRatio() {
		int males = 0;
		int females = 0;
		for(int i = 0; i < dogs.size(); i++) {
			if(dogs.get(i).getGender().equals("M"))
				males++;
			else
				females++;
		}
		int[] ratio = new int[]{males, females};
		return ratio;
	}
	public String toString() {
		String output = "";
		for(Dog d : dogs) {
			output += d.toString() + "\n";
		}
		return output;
	}
}