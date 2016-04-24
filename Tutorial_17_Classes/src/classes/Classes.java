package classes; // package must equal public class name otheriwse it wont work !!!!

class friend { // classes are types (blue print of a variable/objects)
	//variables of the class 
	String name;
	int age;
	String status;
}

class work_details {
	int pay;
	String industry;
}

public class Classes {

	public static void main(String[] args) {
//ClassType/ObjectType Variable = new Object();
		friend Nikhil = new friend();
		work_details Nikhil2 = new work_details();
		friend Dimple = new friend();
		work_details Dimple2 = new work_details();

		Nikhil.name = "Nikhil"; 
		Nikhil.age = 24;
		Nikhil.status = "mate";
		Nikhil2.pay = 21000;
		Nikhil2.industry = "IT";		
		Dimple.name = "Dimple"; 
		Dimple.age = 27;
		Dimple.status = "GF";
		Dimple2.pay = 32000;
		Dimple2.industry = "teacher";
		
		System.out.println(Dimple.name +"\t"+ Dimple.status +"\t"+ Dimple2.industry);
	}

}
