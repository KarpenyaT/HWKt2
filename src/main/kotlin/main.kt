import kotlin.math.round

fun main() {
    val amount = 23500
    val minComm = 35
    val comm: Int
    val percComm = 0.0075
    if (amount * percComm <= minComm) {
        comm = minComm
    } else {
        comm = round(amount * percComm).toInt()
    }
    println(comm)
}