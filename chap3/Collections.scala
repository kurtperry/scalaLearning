class Collections {

	// 1. Demonstrate the difference between “to” and “until” with a simple for loop.
	def simpleLoopTo = {for (i <- 1 to 2) println("Iteration " + i) }
	//Iteration 1
	//Iteration 2

	def simpleLoopUntil = {for (i <- 1 until 2) println("Iteration " + i) }
	//Iteration 1
	 


	// 2. Demonstrate that you can print 12 13 21 23 31 32 with 2 for loops
	def printNums = {
		for(i <- 1 to 3; j <- 1 to 3 if i != j) println (s"$i$j")
	}

	// 3. Demonstrate you can build a vector from a for loop
	def createVector = {
		var vec: Vector[Int] = Vector.empty
		for (i <- 1 to 3) vec = vec :+ i
		println(vec) //Vector(1, 2, 3)
	}

	// 4. Print only the 2nd part of the following tuples (1,1)(1,2)(1,3), so the output is 1 2 3
	def printValues = {
		val tupleMap = Map(1 -> 1, 2 -> 2, 3 -> 3)
		for((k,v) <- tupleMap) {
			println(v)	//Why does this code only print the last one?
		}
		//tupleMap.foreach {case(k,v) => println(v)}  
		// tupleMap.foreach (x => println(x._2))

	}

	// 5. Create a simple Map and print all its keys
	def printMapKeys = {
		val map = Map(1 -> "Joe", 2 -> "Bob", 3 -> "Alex")
		for((k,v) <- map) println(k)
	}
	// 6. In array of numbers from 1 to 10, filter out all the even numbers
	def printOdd = {
		for (x <- 1 to 10 if x%2 != 0) println(x)
	}
	// 7. In array of numbers from 1 to 10, map all the even numbers to print, “I am an even number, my value is: value“
	def printEven = {
		for (x <- 1 to 10 if x%2 == 0) println(s"I am an even number, my value is: $x")
	}
	// 8. In array of numbers from 1 to 10, find 7 using functional combinators
	def findSeven = {
		(1 to 10 toArray).filter((i: Int) => i == 7)
	}
}
