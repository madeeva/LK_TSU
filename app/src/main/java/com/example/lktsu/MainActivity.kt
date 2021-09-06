package com.example.lktsu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lktsu.data.Id
import com.example.lktsu.data.model.StudentEntity
import com.example.lktsu.di.DataStoreScope
import com.example.lktsu.repositories.RoomRepositoryImpl
import com.example.lktsu.ui.login.LoginActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var roomRepositoryImpl: RoomRepositoryImpl

    private lateinit var studentEntity: StudentEntity

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(com.example.lktsu.R.layout.activity_main)

        DataStoreScope.launch(Dispatchers.IO) {
            studentEntity = roomRepositoryImpl.getStudent(Id.long)
        }

        setContentView(com.example.lktsu.R.layout.activity_main)

        val textName: TextView = findViewById(com.example.lktsu.R.id.textName)
        textName.text = studentEntity.name

        val textGroup: TextView = findViewById(com.example.lktsu.R.id.textGroup)
        textGroup.text = studentEntity.group
    }

    fun onClickNews(view: View?) {
        val intent = Intent(this@MainActivity, NewsActivity::class.java)
        startActivity(intent)
    }

    fun onClickSchedule(view: View?) {
        val intent = Intent(this@MainActivity, ScheduleActivity::class.java)
        startActivity(intent)
    }

    fun onClickMarks(view: View?) {
        val intent = Intent(this@MainActivity, MarksActivity::class.java)
        startActivity(intent)
    }

    fun onClickStatements(view: View?) {
        val intent = Intent(this@MainActivity, StatementsActivity::class.java)
        startActivity(intent)
    }

    fun onClickIcon(view: View?) {
        val intent = Intent(this@MainActivity, ContactsActivity::class.java)
        startActivity(intent)
    }

    fun onClickExit(view: View?) {
        val intent = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(intent)
    }

    fun onClickAbout(view: View?) {
        val text = "Данное приложение является разработкой в рамках ВКР\nстудента Мадеевой В. А. гр. 221071"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    fun onClickInfo(view: View?) {
        val text = "Для просмотра/изменения контактных данных кликните по изображению над Вашим ФИО"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}
