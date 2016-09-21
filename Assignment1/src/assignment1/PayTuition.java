package assignment1;
/*

Scenario : Pay tuition
Description : A student wants to pay his tuition through myNEU account.

Objects (with States and behaviors) :
	Object : Student
		State : name, username, password
		Behavior : loginMyNEU(), makePaymentOrder(), transferMoneyToNEU()

	Object : myNEUWebsite
		State : NUID, student's name
		Behavior : GetStudentInfo(), displayAmountOfTuition(), acceptMoneyFromStudent()

	Object : Money
		State : amount

*/

public class PayTuition {

	public static void main(String[] args) {
		Student jim = new Student();
		jim.name = "Jim";
		jim.username = "xxxx";
		jim.password = "yyyy";
		
		myNEUWebsite myneu = new myNEUWebsite();
		jim.loginMyNEU(myneu);
		myneu.getStudentInfo(jim.username);
		myneu.displayAmountOfTuition();
		jim.makePaymentOrder();
		Money money = jim.transferMoneyToNEU(myneu);
		myneu.acceptMoneyFromStudent(jim, money);
	}

}

class Student{
	String name;
	String username;
	String password;
	void loginMyNEU(myNEUWebsite neu){}
	void makePaymentOrder(){}
	Money transferMoneyToNEU(myNEUWebsite neu){}
}

class myNEUWebsite{
	String NUID;
	String studentName;
	void getStudentInfo(String username){}
	void displayAmountOfTuition(){}
	void acceptMoneyFromStudent(Student s, Money money){}
	
}

class Money{
	float Amount;
}

