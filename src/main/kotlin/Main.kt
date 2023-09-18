import kotlin.random.Random
// Богомолов Даннил 1 варинат
fun main() {
    // 4.1 средний уровень
    val nums1 = List(10) { Random.nextInt(0, 11) }
    val nums2 = List(10) { Random.nextInt(0, 11) }
    println("первый список: $nums1 \nвторой список: $nums2")
    val nums3 = mutableListOf<Int>()

    for (i in 0..8) {

        if (i % 2 == 0) nums3.add(nums1[i+1])
        else nums3.add(nums2[i])
    }
    nums3.add(nums2[8])
    println(nums3)

    // 4.2 базовый уровень
    val biMas = mutableListOf<MutableList<Int>>()
    for (j in 0..2){
        biMas.add(MutableList(4) {Random.nextInt(0, 10)} )
    }
    println("Без сортировки")
    for (j in 0..2){
        println(biMas[j])
    }
    println("C сортировкой")
    biMas[2].sort()
    for (j in 0..2){
        println(biMas[j])
    }
}