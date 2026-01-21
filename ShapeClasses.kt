import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    /*val testCircle = Circle(5.0)
    println(testCircle.calcArea())
    println(testCircle.calcPerimeter())*/
    
    /*val testTriangle = Triangle(2.0, 3.0, 4.0)
    println(testTriangle.calcArea())
    println(testTriangle.calcPerimeter())*/
    
    val testCircle = Circle(5.0)
    println(testCircle.name)
    testCircle.changeName("testCircle")
    println(testCircle.name)
    println(testCircle.calcArea())
    println(testCircle.calcPerimeter())
    
    val testTriangle = Triangle(2.0, 3.0, 4.0)
    println(testTriangle.name)
    testTriangle.changeName("testTriangle")
    println(testTriangle.name)
}

/*class Circle(val radius: Double){
    fun calcArea() = PI * radius.pow(2.0)
    fun calcPerimeter() = PI * (radius * 2)
}

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double){
    fun calcPerimeter() = sideA + sideB + sideC
    fun calcArea(): Double{
        val s = calcPerimeter() / 2
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}

open class Shape(var name: String){
    fun changeName(newName: String){
      name = newName  
    } 
}*/

/*open class Shape(var name: String){
    fun changeName(newName: String){
      name = newName  
    } 
}

class Circle(val radius: Double) : Shape("Circle"){
    fun calcArea() = PI * radius.pow(2.0)
    fun calcPerimeter() = PI * (radius * 2)
}

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) : Shape("Triangle"){
    fun calcPerimeter() = sideA + sideB + sideC
    fun calcArea(): Double{
        val s = calcPerimeter() / 2
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}*/

abstract class Shape(var name: String){
    fun changeName(newName: String){
      name = newName  
    } 
    
    abstract fun calcPerimeter(): Double
    abstract fun calcArea(): Double
}

class Circle(val radius: Double) : Shape("Circle"){
    override fun calcArea() = PI * radius.pow(2.0)
    override fun calcPerimeter() = PI * (radius * 2)
}

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) : Shape("Triangle"){
    override fun calcPerimeter() = sideA + sideB + sideC
    override fun calcArea(): Double{
        val s = calcPerimeter() / 2
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}
