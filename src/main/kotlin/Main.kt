import java.io.File

fun checkArgs(args: Array<String>) : Boolean {
    if (args.size < 2) {
        return false
    }
    return true
}

fun main(args: Array<String>) {
    println("Hello World!")
    if (!checkArgs(args)) {
        println("Too few arguments of command line")
        return
    }

    val fn1 = args[0]
    val f = File(fn1)
    if (!f.exists()) {
        println("File $fn1 does not exist")
        return
    }

    //var s = readLine()

    println("Number of arguments: ${args.size}"); println("\n")
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}
