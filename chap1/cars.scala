// 6. Create a package object with a constant value for number of wheels that can be used in both the classes
package object Car{
  val defaultWheels: Int = 4
}

package Car{
	// 1. Create an abstract class Car with a Sedan class extending it. 
	// Your class must have a number of wheels and number of doors as properties for the class.

	abstract class Car {
	  var wheels: Int
	  var doors: Int
	}

	class Sedan extends Car {

	  var wheels = 0
	  var doors = 0

	  //2. Create an auxiliary constructor for the Sedan class and create an instance and assign to a val named corolla.
	  // scala> val corolla = new Sedan(4)
	  def this(d: Int) {
		this()
		this.doors = d
	  }
	}
// 4. Create a companion object for your Car classes that sets the number of doors and wheels as 4, with an apply method
	object Car{
	  def apply(c: Car) = {c.doors = 4; c.wheels = 4}
	}
	// scala> val sedan = new Sedan
	// scala> Car apply sedan


	// 3. Create a Primary Construct for a new Coupe class with properties number of doors and wheels
	class Coupe(var doors: Int, var wheels: Int) extends Car 
	

	// 5. Create a singleton object with an utility method that describes details about your car
	object CarUtil {
	  def details(c: Car) = printf("You have a car with %d doors and %d wheels", c.doors, c.wheels)
	}
	//scala> Cars details sedan
	//You have a car with 4 doors and 4 wheels
}




