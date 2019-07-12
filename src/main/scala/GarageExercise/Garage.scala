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
    s"Vehicle: ${oldVehicle} has been released from Garage"
  }
  def removeVehicleByPlate(searchedPlate: String): String = {
    for(x <- vehicles){
      if(x.plate == searchedPlate){
        println(releaseVehicle(x))
      }
    }
    "Vehicle removed"
  }
  def fixVehicle(searchedByPlate: String): Unit = {
    for(x <- vehicles){
      if(x.plate == searchedByPlate){
        println(s"Fixing vehicle: ${x.plate}")
        Thread.sleep(3000)
        println(s"The bill is £${calculateBill(searchedByPlate)}")
        println(releaseVehicle(x))
      }
    }
  }
  def calculateBill(plate: String): Int = {
      300
  }
  def checkVehicles(): Unit = {
    for(x <- vehicles){
      println(x.plate)
    }
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
