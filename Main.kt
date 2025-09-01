fun main() {
    println("Hello, Kotlin! Your IDE is working!")

    // Simple calculation to test basic functionality
    val a = 5
    val b = 10
    val sum = a + b

    println("Sum of $a and $b is: $sum")

    // Test a simple function
    val result = greet("User")
    println(result)
}

fun greet(name: String): String {
    return "Welcome, $name! This is a test function."
}