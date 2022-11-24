package com.axis.dbconnection

import java.sql.DriverManager

data class User(var id:Int, val name:String)

fun main() {
    val myurl ="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Sruthi@19")
    println("Connection estabished Successfully!!!")


//select query - Read
    val query = connection.prepareStatement("select * from users")
    val result = query.executeQuery()
    val users = mutableListOf<User>()

    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        users.add(User(id, name))
    }

    for(user in users) {
        println(user)
    }

}