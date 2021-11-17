package com.example.admin

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.google.firebase.database.core.Repo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel(application: Application):AndroidViewModel(application) {
//    val readAllLatihan: LiveData<MutableList<ModelBarang>>
    private val repository:Repository = Repository()

    fun login(user:String, pass:String, context: Context, t:Unit){
        log("Viewmodel")
        repository.loginFirebase(context,user,pass,t)
    }

}