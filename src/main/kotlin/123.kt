fun main()
{
    var s1= student(22,"Nilima")
    println(s1.no)
    println(s1.name)
}
class student(var no:Int)
{
    var name :String=""
    constructor(no: Int,s:String):this (no)
    {
        println("secondery code")
        name=s
    }
    init
    {
        println("Int called")
    }
}