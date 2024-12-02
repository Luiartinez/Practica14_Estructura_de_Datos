/*algoritmos de busqueda */

//busqueda lineal(secuenciales)

fun linearSearch(Array: List <Int>, target: Int): Int{
    for (i in Array.indices){
        if (Array[i] == target) return i
    }
    return -1
}
//busqueda binaria

fun binarySearch(Array: List <Int>, target: Int): Int {
    var star = 0
    var end = Array.size -1

    while (star <= end){
        val mid = (star + end) /2
        when {
            Array[mid] == target -> return mid
            Array[mid] < target -> star = mid + 1
            else -> end = mid - 1
        }
    }
    return -1
}

fun main(args: Array<String>) {
  val list1 = List (10000) {it}
val list2 = List(10000) { (1..10000).random() }



val linearResult = linearSearch(list2, 5000)
  val binaryResult = binarySearch(list1, 5000)

  println("Resultado de busqueda lineal $linearResult ")
  println("Resultado de la busqueda binaria: $binaryResult ")
}