package GarageExercise

object TestApp {
  def main(args: Array[String]): Unit = {
    val customer1 = new Customer("Dan", "Smith")
    val car1 = new Car(customer1, "G607 DAN")
    println(car1.getOwnerName())
    println(car1.toString)
    val garage = new Garage()
    val employee = new Employee("Josh", "Gomersall", "mechanic")
    println(garage.addEmployee(employee))
    garage.checkEmployee()
    println(garage.fireEmployee(employee))
    garage.checkEmployee()
  }
}
