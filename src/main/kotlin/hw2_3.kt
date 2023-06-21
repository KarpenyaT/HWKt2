fun main(){
    val amount=3051
    val firsSale=100
    val secondSale=0.05
    val saleRegular=0.01
    val regularClient=true
    var result:Int

    if (amount>10_000){
        result=amount*(1-secondSale).toInt()
    }else if(amount>1000){
        result=amount-firsSale
    }else{
        result=amount
    }
    if (regularClient){
        result=(result*(1-saleRegular)).toInt()
    }
    println(result)
}