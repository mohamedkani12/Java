package week5;
import java.util.*;
public class Test{

  public static void main(String args[]){

		Person[] persons = new Person[5];


		persons[0] = new SalesPerson("Varsha",
			"Hall",
			34,
			"Varsha101@amazon.com",
			1500,
			70,
			101,
			"amazon"
			);
		persons[1] = new Student("Varsej",
			"Karthikaa",
			21,
			"VarsKart@stanford.edu",
			1000,
			9.8,
			"stanford");
		persons[2] = new DailyWages("Willy",
			"Heath",
			32,
			30.50,
			8);


		for(int i = 0; i < 5; i++){

			if(persons[i] == null) continue;
			if(persons[i] instanceof SalesPerson){
				System.out.println("Email is validated, Output : " + persons[i].validateEmail());
			}else if(persons[i] instanceof Student){
				System.out.println("Email is validated, Output : " + persons[i].validateEmail());
			}
		}

  }


}