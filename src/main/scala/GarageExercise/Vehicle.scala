package GarageExercise

abstract class Vehicle {
  var wheels: Int
  var owner: Customer
  var plate: String
  def getOwnerName(): String = {
    owner.getName()
  }
}
class Bike(bikeOwner: Customer, licencePlate: String) extends Vehicle{
  var wheels = 2
  var owner = bikeOwner
  var plate = licencePlate
  override def toString(): String = {
    s"This bike with licence plate ${plate} owned by ${getOwnerName()}"
  }
}
class Car(carOwner: Customer, licencePlate: String) extends Vehicle{
  var wheels = 4
  var owner = carOwner
  var plate = licencePlate
  override def toString: String = {
    s"The car with licence plate ${plate} owned by ${getOwnerName()}"
  }
}