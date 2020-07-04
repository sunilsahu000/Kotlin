fun main(args: Array<String>) {
    var a = 10
    when (a)
    {
        1 -> print("Value of a is $a")
        in 2..5 -> print("Value of a lies in 2 to 5")
        6 -> print("Value of a is $a")
        in 7..9 -> print("Value of a lies in 7 to 9")
        10 -> print("Value of a is $a")
    }
}