fun main() {
    print("Enter first number: ")
    val a = readLine()!!.toInt()

    print("Enter second number: ")
    val b = readLine()!!.toInt()

    print("Enter operation (+, -, *, /): ")
    val op = readLine()!!

    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "Invalid operation"
    }

    println("Result: $result")
}
