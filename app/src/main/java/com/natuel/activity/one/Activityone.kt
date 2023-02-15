package com.natuel.activity.one

fun main(args: Array<String>){
    activityOne()
    activityTwo()
    activityThree()
}


fun activityOne () {
    //Name
    print("Enter Your name: ")
    var name = readLine()
    //Age
    print("Your age: ")
    var age = readLine()
    //Address
    print("Address: ")
    var location = readLine()
    //Purpose
    print("Why do you want to learn Mobile Development: ")
    var purpose = readLine()

    println("Name: $name ")
    println("Age: $age ")
    println("Address: $location ")
    println("Purpose: $purpose ")

}

fun activityTwo() {
    print("Enter first number: ")
    val numberOne = readLine()?.toInt()
    print("Enter second number: ")
    val numberTwo = readLine()?.toInt()
    val result = numberTwo?.let { numberOne?.times(numberTwo) }
    println("Result: $result ")

}

fun activityThree() {

    //problem 1
    print("input number: ")
    val num = readLine()?.toInt()
    val result = num.let { num?.times(num) }
    print("Result: $num * $num = $result\n")

    //problem 2
    print("input name: ")
    var name = readLine()
    print("input city: ")
    var city = readLine()
    var fullLocation = ("$name \b $city")
    print( "fullLocation: $fullLocation \n" )

    //problem 3
    print("Length: ")
    val length = readLine()?.toInt()

    print("Width: ")
    val width = readLine()?.toInt()

    var area = width?.let {length?.times(width) }

    print("Area: $area" )
}