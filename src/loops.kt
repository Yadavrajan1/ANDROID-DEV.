fun main() {
    for(i in 1..5){
        println(i)
    }

    for(i in 1 until 5){ // upper limit get excluded
        println(i)
    }

    for(i in 5 downTo 1){ // reverse order
        println(i)
    }

    for(i in 5 downTo 1 step 2){ // reverse order
        println(i)
    }


}
