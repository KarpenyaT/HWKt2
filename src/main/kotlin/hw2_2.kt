fun main() {
    val likes = 311
    var strLikes: String

    if (likes%10==1 && likes%100!=11){
        strLikes="Понравилось $likes человеку"
    }else{
        strLikes="Понравилось $likes людям"
    }
    println(strLikes)
}