package com.example.lktsu

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lktsu.data.model.NewsEntity
import com.example.lktsu.data.model.StatementEntity
import com.example.lktsu.repositories.RoomRepositoryImpl
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@AndroidEntryPoint
class MoreActivity : AppCompatActivity() {
    @Inject
    lateinit var roomRepositoryImpl: RoomRepositoryImpl

    private lateinit var news: NewsEntity
    private lateinit var statement: StatementEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)

        val arguments = intent.extras
        val name = arguments!!["id"].toString().toLong()
        val type = arguments!!["type"].toString()

        var text: TextView = findViewById(R.id.textViewMore)
        when(type) {
            "statement" -> {
                runBlocking(Dispatchers.IO) {
                    statement = roomRepositoryImpl.getStatement(name)
                }
                text.text = statement.description

            }
            "news" -> {
                runBlocking(Dispatchers.IO) {
                    news = roomRepositoryImpl.getNews(name)
                }
                text.text = news.description
            }

        }
    }
}