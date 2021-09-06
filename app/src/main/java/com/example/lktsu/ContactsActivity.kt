package com.example.lktsu

import android.R
import android.R.attr.data
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lktsu.data.Id
import com.example.lktsu.data.model.StudentEntity
import com.example.lktsu.repositories.RoomRepositoryImpl
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import javax.inject.Inject


@Suppress("DEPRECATION")
@AndroidEntryPoint
class ContactsActivity : AppCompatActivity() {
    @Inject
    lateinit var roomRepositoryImpl: RoomRepositoryImpl
    private lateinit var student: StudentEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.lktsu.R.layout.activity_contacts)

        runBlocking(Dispatchers.IO) {
            student = roomRepositoryImpl.getStudent(Id.long)
        }

        val str1: String = "89586639724"
        val str2: String = "89651589140"
        val str3: String = ""
        val str4: String = "madeeva.va@gmail.com"

        val tel1: TextView = findViewById(com.example.lktsu.R.id.Phone1)
        tel1.text = str1

        val tel2: TextView = findViewById(com.example.lktsu.R.id.Phone2)
        tel2.text =  str2

        val arguments = intent.extras
        val i = arguments!!["i"]

        val tel3: TextView = findViewById(com.example.lktsu.R.id.Phone3)
        if(i==1){
            tel3.text =  str3
        }
        else{
            tel3.text = "89776249952"
        }

        val email: TextView = findViewById(com.example.lktsu.R.id.EmailAddress)
        email.text =  str4
    }

    fun onClickSave(view: View?){
        val tel3: TextView = findViewById(com.example.lktsu.R.id.Phone3)
        tel3.text =  "89776249952"
        val arguments = intent.extras
        var i = arguments!!["i"]
        i = 2
    }

    fun onClickInfo(view: View?) {
        val text =
            "Для изменения контактных данных введите новую информацию в соответсвующее поле и нажмите кнопку Сохранить"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}