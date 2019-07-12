package GarageExercise

import scala.collection.mutable.ListBuffer

class Garage(currentVehicles: ListBuffer[Vehicle], currentEmployees: ListBuffer[Employee]) {
  def this() = this(ListBuffer(), ListBuffer())
  var vehicles = currentVehicles
  var employees = currentEmployees
  def addVehicle(newVehicle: Vehicle): String = {
    vehicles = vehicles :+ newVehicle
    "Vehicle added"
  }
  def releaseVehicle(oldVehicle: Vehicle): String = {
    vehicles.remove(vehicles.indexOf(oldVehicle))
    "Vehicle released from Garage"
  }
  def removeVehicleByPlate(searchedPlate: String): String = {
    "lol"
  }
  def addEmployee(newEmployee: Employee): String = {
    employees = employees :+ newEmployee
    "Employee added"
  }
  def fireEmployee(oldEmployee: Employee): String = {
    employees.remove(employees.indexOf(oldEmployee))
    "Employee deleted from database"
  }
  def checkEmployee(): Unit = {
    for(x <- employees){
      println(x.getName())
    }
  }
}
