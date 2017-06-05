class Traits {

}

// 1. Define a trait Shape, define an abstract method “area” 

trait Shape {
	def area(x: Int, y: Int)
}


// 2. Define a trait Square that extends the trait Shape, provide a default implementation for the abstract method “area”
trait Square extends Shape {
	val sides: Int = 4  // 3. Define a constant value in your trait for number of sides.
	def area(x: Int, y:Int = 0) = x*x
}





// 4. Create a class PostCard which extends Shape and Square.

class PostCard extends Shape with Square {
	def area(x: Int, y: Int) = x*y
}


// 5. Create a class GreetingCard which extends Shape and Square.
class GreetingCard extends Shape with Square {
	def area(x: Int, y: Int) = x*y
}


// 6. Create an array of Shape which includes PostCard, GreetingCard
object Traits {
def method1() = {
  val shapes: Array[Shape] = Array[Shape]()
  shapes(0) = new PostCard
  shapes(1) = new GreetingCard
}
}









