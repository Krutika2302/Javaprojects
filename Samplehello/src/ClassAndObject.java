


class Employee{
	String name;
	int year;
	String address;
}

public class ClassAndObject {

	public static void main(String[] args) {


		Employee person1 = new Employee();
		Employee person2 = new Employee();
		Employee person3 = new Employee();

		person1.name = "Robert";
		person1.year = 1994;
		person1.address = "64C-WallsStreet";

		info(person1.name, person1.year, person1.address);
		System.out.println();

		person2.name = "Sam";
		person2.year = 2000;
		person2.address = "68D-WallsStreet";

		info(person2.name, person2.year, person2.address);
		System.out.println();

		person3.name = "John";
		person3.year = 1999;
		person3.address = "26B-WallsStreet";
		info(person3.name, person3.year, person3.address);



	}
	static void info(String name,int year , String address) {
		System.out.println("Information of the employee");
		System.out.println("Name : "+name);
		System.out.println("Year of joining : " + year);
		System.out.println("Address : " + address);
	}

}
