fun main() {
    val inputList = listOf(1, 2, 3, 4, 5, 6)
    val (firstHalf, secondHalf) = listSplitter(inputList)
    
    println(firstHalf)
    println(secondHalf)
}

fun listSplitter(fullList: List<Int>): Pair<List<Int>, List<Int>>{
    val middle = fullList.size / 2
    
    val listOne = mutableListOf<Int>()
    val listTwo = mutableListOf<Int>()
    
    for (i in 0 until middle){
        listOne.add(fullList[i])
    }
    
    for (i in middle until fullList.size){
        listTwo.add(fullList[i])
    }
    
    return Pair(listOne, listTwo)
}
