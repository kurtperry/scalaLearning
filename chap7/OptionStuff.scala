class OptionStuff {
	
	import scala.util._	

	//1. What are 3 alternatives to "get" for retrieving a value contained in Option?
		//getOrElse
		//foreach
		//match

	//2. Demonstrate retreiving a value from Option using "match."
		def optionTest = {
			Map("Ayla" -> 9, "Ashlyn" -> 5).get("Ayla") match {
			case Some(i) => printf("Ayla is %d years old.", i)
		 	case None => println("I don't know how old she is.")
			}
		}
		// Ayla is 9 years old.


	//3. Use a method from the Map class to search the Map and and supply a default return value if it's not found.
		def mapOption = {
			val map = Map[String, Int]("Ayla" -> 9, "Ashlyn" -> 5, "Ethan" -> 3)
			map.getOrElse("Kurt", 39)
		}
	 
	//4. Use foreach to retrieve the value from a "Success" object after using Try
		def success = {				
			Try(1/1).foreach(println)
			//1
		}	

	//5. Use match to get the error message from a Failure
		def failure = {	
			Try(1/0) match {
				case Success(i) => println(i)
				case Failure(f) => println(f)
			}
			//java.lang.ArithmeticException: / by zero
		}
}

	
