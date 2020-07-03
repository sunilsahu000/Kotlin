fun main(args: Array<String>) {
    add(4,6){println(it) }
}

 fun add(a:Int,b:Int,lambdas :(Int) -> Unit)
 {
     var result :Int = a+b
    lambdas(result)
 }