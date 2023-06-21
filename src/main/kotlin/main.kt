import kotlin.math.round

fun main(){
    val amount=35
    val minComm=35
    val comm:Int
    val persComm=0.0075
    if (amount<=minComm){
        comm=minComm
    }else{
        comm= round(amount*persComm).toInt()
    }
    println(comm)
}