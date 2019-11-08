package com.example.smarthub

import com.google.firebase.database.FirebaseDatabase
import com.google.gson.Gson
import com.google.firebase.database.DatabaseReference

/* Naming conventions:
    Start data class name with d_ followed by first letter in upper case format eg: d_User
    Start class name with c_ followed by first letter in upper case format eg: c_User
 */

data class d_User(
    var userId: String? = "",
    var username: String? = "",
    var email: String? = "",
    var password: String? = "",


)

class c_User(userData: d_User) {
    private var user = userData;

    fun save(){
        if()
    }
}

fun writeNewUser(userId: String, username: String, email: String?, password: String) {
    //val newUser = database.child("users").push();
    //user.userId = newUser.key;
    var database = FirebaseDatabase.getInstance()

    //newUser.setValue(user);
    val ref = database.getReference("users")
    val newUser = ref.push()

    val user = User(newUser.key, username, email, firstname, lastname, password)

    val gson = Gson()

    newUser.setValue(gson.toJson(user))
}