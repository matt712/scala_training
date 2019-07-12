package GarageExercise

abstract class Person {
  var firstName: String
  var lastName: String
  def getName(): String = {
    s"${firstName} ${lastName}"
  }
}
class Employee(employeeFirstName: String, employeeLastName: String, currentJobTitle: String) extends Person{
  var firstName = employeeFirstName
  var lastName = employeeLastName
  var jobTitle = currentJobTitle
  override def toString(): String = {
    s"This ${jobTitle} is called ${getName()}"
  }
}

class Customer(customerFirstName: String, customerLastName: String) extends Person{
  var firstName = customerFirstName
  var lastName = customerLastName
  override def toString(): String = {
    s"This customer is called ${getName()}"
  }
}
