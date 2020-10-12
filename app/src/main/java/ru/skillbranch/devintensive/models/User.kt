package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

class User(
    val id:String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int = 0,
    var respect:Int = 0,
    val lastVisit: Date? = null,
    val isOnline:Boolean = false
) {
    constructor(id:String, firstName:String?, lastName:String?) : this (
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id:String):this(id, "John", "Doe $id")

    init {
        println("I am alive")
    }

    companion object Factory {
        private var lastid:Int = -1
        fun makeUser(fullname:String?) : User {



            lastid++

            val (firstName, lastName) = Utils.parseFullName(fullname);
            return User(id="$lastid", firstName = firstName, lastName = lastName)
        }
    }

}