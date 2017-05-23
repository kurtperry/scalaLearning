class Calculator ({ 
  val make = "Texas Instrument"
  def printMake(): Unit = {
    println( s"""The model of our calculator is ${make}""" )
  }
  
  def calculatePercentage(number: Long, percentage: Double): Unit = {
    println( s""" The percentage is ${(number/percentage)}""" )
  }
}  
