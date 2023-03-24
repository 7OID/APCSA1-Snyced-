package unit6;

public class Dog {
	private String breed;
	private String color;
	private String name;
	private String gender;
	private int age;
	private int weight;
	
	public Dog(String data) {
		String[] arr = data.split(",");
		breed = arr[0];
		name = arr[1];
		color = arr[2];
		gender = arr[3];
		age = Integer.parseInt(arr[4]);
		weight = Integer.parseInt(arr[5]);
	}
	public String toString() {
		String fullGender = "";
		if(gender.equals("M"))
			fullGender = "Male";
		else
			fullGender = "Female";
		return name + " - " + fullGender + " " + breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}