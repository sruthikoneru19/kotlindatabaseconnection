package com.axis.dbconnection

import java.sql.DriverManager

fun main() {
    val myurl ="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Sruthi@19")
    println("Connection estabished Successfully!!!")

    //   insert query -Create
    val stmt =connection.createStatement()
    val delete_res = stmt.executeUpdate("delete from users where id = 1")
    if( delete_res > 0){
        println("successfully deleted record in users db !!!")
        println("$delete_res deleted")
    } else{
        println("Update Not sucessful")
    }
}

