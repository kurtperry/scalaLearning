class CaseClasses {

	// 2. Create an employee with the name John Doe. Using copy create an employee Jane Doe who also is the same age and dept.
	def createEmp = {
		val emp1 = Employee("John Doe", 39, "IT")
		val emp2 = emp1.copy(name = "Jane Doe")
	}

}	

// 1. Define a case class Employee with Name, age, dept
case class Employee(name: String, age: Int, dept: String)

// 3. Define a case class Person with Name and age
case class Person(name: String, age: Int)	

// 4. Create an apply method for your Employee class that takes a Person. Assign the Person to the IT department
object Employee {
	def apply(p: Person) = new Employee(p.name, p.age, "IT")

	// 5. Create an unapply method to give back a Person from an employee
	def unapply(e: Employee):Person = Person(e.name, e.age)

}

// 6. Create a case class with 23 params, using apply method populate the case class.

