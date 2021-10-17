//abstract class Human(val name: String){
//    abstract var age: Int
//    abstract fun hello()
//}
//
//class Person(name: String): Human(name){
//    override var age: Int = 1
//    override fun hello() {
//        println("My name is $name")
//    }
//}
//
//
//abstract class Figure {
//    abstract fun perimeter(): Float
//    abstract fun area(): Float
//}
//
//class Rectangle(val width: Float, val height: Float) : Figure(){
//    override fun perimeter(): Float{
//        return width * 2 + height * 2;
//    }
//    override fun area(): Float{
//        return width * height;
//    }
//}
//
//interface Movable{
//    var speed: Int
//    fun move()
//    fun stop(){
//        println("Остановка")
//    }
//}
//
//class Car : Movable{
//
//    override var speed = 60
//    override fun move(){
//        println("Машина едет со скоростью $speed км/ч")
//    }
//}
//
//class Aircraft : Movable{
//
//    override var speed = 600
//    override fun move(){
//        println("Самолет летит со скоростью $speed км/ч")
//    }
//    override fun stop(){
//        println("Приземление")
//    }
//}
//
//class Person(username: String, password: String){
//
//    val test: String = ""
//    private val account: Account = Account(username, password)
//
//    private inner class Account(val username: String, val password: String)
//    {
//        fun hello(){
//            test
//        }
//    }
//
//    fun showAccountDetails(){
//        println("UserName: ${account.username}  Password: ${account.password}")
//        account.hello()
//    }
//}
//
//class BankAccount(private var sum: Int){
//
//    fun display(){
//        println("sum = $sum")
//    }
//
//    inner class Transaction{
//        fun pay(s: Int){
//            sum -= s
//            display()
//        }
//    }
//}

data class Person(var name: String, var age: Int){

}


fun main(){

    val alice = Person("Alice", 24)
    val kate = alice.copy()
    kate.name = "Kate"
    println(alice.toString())
    println(kate.toString())

    val (username, userage) = alice
    println("Name: $username  Age: $userage")

//    val alice: Person = Person("Alice", 24)
//    println(alice.toString())

//    val userAcc = Person.Account("qwerty", "123456");
//    userAcc.showDetails()

//    val tom = Person("qwerty", "123456");
//    tom.showAccountDetails()

//    val m1: Movable = Car()
//    val m2: Movable = Aircraft()
//
//    m1.move()
//    m1.stop()
//    m2.move()
//    m2.stop()
//    val kate: Person = Person("Kate")
//    val slim: Human = Person("Slim Shady")
//    kate.hello()
//    slim.hello()
}