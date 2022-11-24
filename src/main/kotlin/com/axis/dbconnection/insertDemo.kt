package com.axis.dbconnection

import java.sql.DriverManager

//model class
//data class User(var id:Int, val name:String)

fun main() {
    val myurl ="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Deepti@9987$")
    println("Connection estabished Successfully!!!")

    //   insert query -Create
    val stmt =connection.createStatement()
    val res = stmt.executeUpdate("Insert into users values(1,'Sejal')")
    if (res > 0) {
        println("successfully inserted record into users db !!!")
    } else {
        println("Insert Not sucessful")
    }
}