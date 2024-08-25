fun main() {
    var arr = arrayOf("a","b","c","d") // store in contigous memory loctaion
    for(i in arr){
        println(i)
    }
    var arr1= listOf("a","b","c","d")
    for(i in arr1){
        println(i)
    }

    var alpha = arrayOf("Hi","Hello","123")
    for(i in alpha){
        println("the value of ${alpha.indexOf(i)} "+i)
    }

    for(i in alpha.indices){
        println("the value of $i is ${arr[i]}")
    }

}