fun main()
{
    var a = 25
    var b = 50
    var add =add(a,b)
    println("Addition of ${a} and ${b} is :"+add)

    var sub =sub(a,b)
    println("Substrection of ${a} and ${b} is :"+sub)

    var mul =mul(a,b)
    println("Multiplection of ${a} and ${b} is :"+mul)

    var div =div(a,b)
    println("Division of ${a} and ${b} is :"+div)

}
fun add(a:Int,b:Int):Int
{
    return a+b
}
fun sub(a:Int,b:Int):Int
{
    return a-b
}
fun mul(a:Int,b:Int):Int
{
    return a*b
}
fun div(a:Int,b:Int):Int
{
    return a/b
}


