// 1. Define a ternary operation using Scala syntax
	if(5>4) true else false

// 2. Define a if and else block that returns “true” if x > 0 and if not return a Unit
	def testValue(x: Int) = if(x > 0) true else Unit
// 3. Define a match on values for an integer, return true for n > 0 and n < 2, for everything else return false
	def matchValues(x: Int): Boolean = {
		x match {
			case x if (x < 2 && x > 0) => true
			case _ => false
		}
	}

// 4. Define a match on type for all numeric type, return true and  for everything else return false
	def matchType(t: Any): Boolean = {
		t match {
			case t: java.lang.Number => true
			case _ => false
		}
	}
