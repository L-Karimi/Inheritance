fun main(){
var car1 = Car("Isuzu","d max","Blue",4)
 car1.carry(8)
car1.identity()
println(car1.calculateParkingFees(12))
    var bus = Bus("Isuzu","Toyota","White",45)

    println(bus.maxTripFare(250.0))
    println(bus.calculateParkingFees(2))
}
 open  class Car( var make: String, var model: String, var color: String, var capacity: Int){
     fun carry(people:Int){

         var y = people-capacity
         if (people<=capacity){
    println("Carrying $people passengers")
}else{

             println("Over capacity by $y")
}
}
         fun identity(){
             println("I am  $color $make  $model")

         }
     open    fun calculateParkingFees(hours:Int): Int {
            var totalhrs = hours*20
             return totalhrs
         }

     }
class  Bus (make:String, model:String, color:String, capacity:Int):Car(make, model, color, capacity){

fun maxTripFare(fare:Double): Double {
     var maxfare = fare*capacity*1
    return maxfare
}

    override fun calculateParkingFees(hours: Int): Int {
        var totalhrs = hours*capacity
        return totalhrs
    }
}