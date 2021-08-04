package com.example.roomdatabase.room.repository

import androidx.lifecycle.LiveData
import com.example.roomdatabase.room.dao.UserDao
import com.example.roomdatabase.room.entity.User

class UserRepository(private val userDao : UserDao) {

    val readAllData : LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }
}