package com.axis.dbconnection

import java.sql.DriverManager

fun main() {
    val myurl ="jdbc:mysql://localhost:3306/kotlindb"//localhost is the database name
    val connection= DriverManager.getConnection(myurl,"root","Sruthi@19")
    println("Connection estabished Successfully!!!")

    //   insert query -Create
    val stmt =connection.createStatement()
    stmt.executeUpdate("create table product(id int ,name varchar (45));")
    print("Table Created!!")
}