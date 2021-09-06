package com.example.lktsu

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import androidx.appcompat.app.AppCompatActivity
import com.example.lktsu.data.Id
import com.example.lktsu.repositories.RoomRepositoryImpl
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import javax.inject.Inject


@AndroidEntryPoint
class MarksActivity : AppCompatActivity() {

    @Inject
    lateinit var roomRepositoryImpl: RoomRepositoryImpl

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(com.example.lktsu.R.layout.activity_marks)

        var smstr: Array<String> = arrayOf(
            "1", "2", "3", "4", "5", "6", "7", "8"
        )

        //вывод ср. балла диплома
        var mid: TextView = findViewById(com.example.lktsu.R.id.ball)
        mid.setText("4.925")

        //выпадающий список семестров
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, smstr)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        var spinner: Spinner = findViewById(com.example.lktsu.R.id.spinner)
        spinner.setAdapter(aa)

        var textView: TextView

        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                itemSelected: View?, selectedItemPosition: Int, selectedId: Long
            ) {
                if (smstr[selectedItemPosition] == "1"){
                    val semesterMarks = runBlocking(Dispatchers.IO) {
                        roomRepositoryImpl.getSemesterMarks(Id.long, smstr[selectedItemPosition].toLong())
                    }
                    textView = findViewById(com.example.lktsu.R.id.sbjct1)
                    textView.text = "${semesterMarks[0].subject} (${semesterMarks[0].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk1)
                    textView.text = semesterMarks[0].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct2)
                    textView.text = "${semesterMarks[1].subject} (${semesterMarks[1].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk2)
                    textView.text = semesterMarks[1].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct3)
                    textView.text = "${semesterMarks[2].subject} (${semesterMarks[2].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk3)
                    textView.text = semesterMarks[2].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct4)
                    textView.text = "${semesterMarks[3].subject} (${semesterMarks[3].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk4)
                    textView.text = semesterMarks[3].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct5)
                    textView.text = "${semesterMarks[4].subject} (${semesterMarks[4].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk5)
                    textView.text = semesterMarks[4].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct6)
                    textView.text = "${semesterMarks[5].subject} (${semesterMarks[5].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk6)
                    textView.text = semesterMarks[5].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct7)
                    textView.text = "${semesterMarks[6].subject} (${semesterMarks[6].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk7)
                    textView.text = semesterMarks[6].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct8)
                    textView.text = "${semesterMarks[7].subject} (${semesterMarks[7].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk8)
                    textView.text = semesterMarks[7].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct9)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk9)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct15)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk15)
                    textView.text = " "

                }
                else if (smstr[selectedItemPosition] == "2") {
                    val semesterMarks = runBlocking(Dispatchers.IO) {
                        roomRepositoryImpl.getSemesterMarks(Id.long, smstr[selectedItemPosition].toLong())
                    }
                    textView = findViewById(com.example.lktsu.R.id.sbjct1)
                    textView.text = "${semesterMarks[0].subject} (${semesterMarks[0].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk1)
                    textView.text = semesterMarks[0].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct2)
                    textView.text = "${semesterMarks[1].subject} (${semesterMarks[1].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk2)
                    textView.text = semesterMarks[1].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct3)
                    textView.text = "${semesterMarks[2].subject} (${semesterMarks[2].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk3)
                    textView.text = semesterMarks[2].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct4)
                    textView.text = "${semesterMarks[3].subject} (${semesterMarks[3].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk4)
                    textView.text = semesterMarks[3].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct5)
                    textView.text = "${semesterMarks[4].subject} (${semesterMarks[4].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk5)
                    textView.text = semesterMarks[4].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct6)
                    textView.text = "${semesterMarks[5].subject} (${semesterMarks[5].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk6)
                    textView.text = semesterMarks[5].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct7)
                    textView.text = "${semesterMarks[6].subject} (${semesterMarks[6].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk7)
                    textView.text = semesterMarks[6].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct8)
                    textView.text = "${semesterMarks[7].subject} (${semesterMarks[7].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk8)
                    textView.text = semesterMarks[7].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct9)
                    textView.text = "${semesterMarks[8].subject} (${semesterMarks[8].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk9)
                    textView.text = semesterMarks[8].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct15)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk15)
                    textView.text = " "
                }
                else if (smstr[selectedItemPosition] == "3") {
                    val semesterMarks = runBlocking(Dispatchers.IO) {
                        roomRepositoryImpl.getSemesterMarks(Id.long, smstr[selectedItemPosition].toLong())
                    }
                    textView = findViewById(com.example.lktsu.R.id.sbjct1)
                    textView.text = "${semesterMarks[0].subject} (${semesterMarks[0].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk1)
                    textView.text = semesterMarks[0].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct2)
                    textView.text = "${semesterMarks[1].subject} (${semesterMarks[1].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk2)
                    textView.text = semesterMarks[1].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct3)
                    textView.text = "${semesterMarks[2].subject} (${semesterMarks[2].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk3)
                    textView.text = semesterMarks[2].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct4)
                    textView.text = "${semesterMarks[3].subject} (${semesterMarks[3].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk4)
                    textView.text = semesterMarks[3].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct5)
                    textView.text = "${semesterMarks[4].subject} (${semesterMarks[4].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk5)
                    textView.text = semesterMarks[4].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct6)
                    textView.text = "${semesterMarks[5].subject} (${semesterMarks[5].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk6)
                    textView.text = semesterMarks[5].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct7)
                    textView.text = "${semesterMarks[6].subject} (${semesterMarks[6].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk7)
                    textView.text = semesterMarks[6].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct8)
                    textView.text = "${semesterMarks[7].subject} (${semesterMarks[7].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk8)
                    textView.text = semesterMarks[7].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct9)
                    textView.text = "${semesterMarks[8].subject} (${semesterMarks[8].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk9)
                    textView.text = semesterMarks[8].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct10)
                    textView.text = "${semesterMarks[9].subject} (${semesterMarks[9].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk10)
                    textView.text = semesterMarks[9].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct11)
                    textView.text = "${semesterMarks[10].subject} (${semesterMarks[10].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk11)
                    textView.text = semesterMarks[10].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct15)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk15)
                    textView.text = " "
                }
                else if (smstr[selectedItemPosition] == "4"){
                    val semesterMarks = runBlocking(Dispatchers.IO) {
                        roomRepositoryImpl.getSemesterMarks(Id.long, smstr[selectedItemPosition].toLong())
                    }
                    textView = findViewById(com.example.lktsu.R.id.sbjct1)
                    textView.text = "${semesterMarks[0].subject} (${semesterMarks[0].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk1)
                    textView.text = semesterMarks[0].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct2)
                    textView.text = "${semesterMarks[1].subject} (${semesterMarks[1].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk2)
                    textView.text = semesterMarks[1].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct3)
                    textView.text = "${semesterMarks[2].subject} (${semesterMarks[2].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk3)
                    textView.text = semesterMarks[2].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct4)
                    textView.text = "${semesterMarks[3].subject} (${semesterMarks[3].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk4)
                    textView.text = semesterMarks[3].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct5)
                    textView.text = "${semesterMarks[4].subject} (${semesterMarks[4].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk5)
                    textView.text = semesterMarks[4].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct6)
                    textView.text = "${semesterMarks[5].subject} (${semesterMarks[5].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk6)
                    textView.text = semesterMarks[5].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct7)
                    textView.text = "${semesterMarks[6].subject} (${semesterMarks[6].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk7)
                    textView.text = semesterMarks[6].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct8)
                    textView.text = "${semesterMarks[7].subject} (${semesterMarks[7].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk8)
                    textView.text = semesterMarks[7].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct9)
                    textView.text = "${semesterMarks[8].subject} (${semesterMarks[8].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk9)
                    textView.text = semesterMarks[8].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct10)
                    textView.text = "${semesterMarks[9].subject} (${semesterMarks[9].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk10)
                    textView.text = semesterMarks[9].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct15)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk15)
                    textView.text = " "
                }
                else if (smstr[selectedItemPosition] == "5"){
                    val semesterMarks = runBlocking(Dispatchers.IO) {
                        roomRepositoryImpl.getSemesterMarks(Id.long, smstr[selectedItemPosition].toLong())
                    }
                    textView = findViewById(com.example.lktsu.R.id.sbjct1)
                    textView.text = "${semesterMarks[0].subject} (${semesterMarks[0].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk1)
                    textView.text = semesterMarks[0].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct2)
                    textView.text = "${semesterMarks[1].subject} (${semesterMarks[1].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk2)
                    textView.text = semesterMarks[1].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct3)
                    textView.text = "${semesterMarks[2].subject} (${semesterMarks[2].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk3)
                    textView.text = semesterMarks[2].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct4)
                    textView.text = "${semesterMarks[3].subject} (${semesterMarks[3].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk4)
                    textView.text = semesterMarks[3].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct5)
                    textView.text = "${semesterMarks[4].subject} (${semesterMarks[4].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk5)
                    textView.text = semesterMarks[4].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct6)
                    textView.text = "${semesterMarks[5].subject} (${semesterMarks[5].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk6)
                    textView.text = semesterMarks[5].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct7)
                    textView.text = "${semesterMarks[6].subject} (${semesterMarks[6].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk7)
                    textView.text = semesterMarks[6].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct8)
                    textView.text = "${semesterMarks[7].subject} (${semesterMarks[7].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk8)
                    textView.text = semesterMarks[7].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct9)
                    textView.text = "${semesterMarks[8].subject} (${semesterMarks[8].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk9)
                    textView.text = semesterMarks[8].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct10)
                    textView.text = "${semesterMarks[9].subject} (${semesterMarks[9].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk10)
                    textView.text = semesterMarks[9].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct11)
                    textView.text = "${semesterMarks[10].subject} (${semesterMarks[10].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk11)
                    textView.text = semesterMarks[10].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct12)
                    textView.text = "${semesterMarks[11].subject} (${semesterMarks[11].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk12)
                    textView.text = semesterMarks[11].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct13)
                    textView.text = "${semesterMarks[12].subject} (${semesterMarks[12].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk13)
                    textView.text = semesterMarks[12].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct15)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk15)
                    textView.text = " "
                }
                else if (smstr[selectedItemPosition] == "6"){
                    val semesterMarks = runBlocking(Dispatchers.IO) {
                        roomRepositoryImpl.getSemesterMarks(Id.long, smstr[selectedItemPosition].toLong())
                    }
                    textView = findViewById(com.example.lktsu.R.id.sbjct1)
                    textView.text = "${semesterMarks[0].subject} (${semesterMarks[0].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk1)
                    textView.text = semesterMarks[0].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct2)
                    textView.text = "${semesterMarks[1].subject} (${semesterMarks[1].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk2)
                    textView.text = semesterMarks[1].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct3)
                    textView.text = "${semesterMarks[2].subject} (${semesterMarks[2].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk3)
                    textView.text = semesterMarks[2].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct4)
                    textView.text = "${semesterMarks[3].subject} (${semesterMarks[3].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk4)
                    textView.text = semesterMarks[3].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct5)
                    textView.text = "${semesterMarks[4].subject} (${semesterMarks[4].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk5)
                    textView.text = semesterMarks[4].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct6)
                    textView.text = "${semesterMarks[5].subject} (${semesterMarks[5].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk6)
                    textView.text = semesterMarks[5].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct7)
                    textView.text = "${semesterMarks[6].subject} (${semesterMarks[6].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk7)
                    textView.text = semesterMarks[6].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct8)
                    textView.text = "${semesterMarks[7].subject} (${semesterMarks[7].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk8)
                    textView.text = semesterMarks[7].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct9)
                    textView.text = "${semesterMarks[8].subject} (${semesterMarks[8].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk9)
                    textView.text = semesterMarks[8].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct15)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk15)
                    textView.text = " "
                }
                else if (smstr[selectedItemPosition] == "7"){
                    val semesterMarks = runBlocking(Dispatchers.IO) {
                        roomRepositoryImpl.getSemesterMarks(Id.long, smstr[selectedItemPosition].toLong())
                    }
                    textView = findViewById(com.example.lktsu.R.id.sbjct1)
                    textView.text = "${semesterMarks[0].subject} (${semesterMarks[0].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk1)
                    textView.text = semesterMarks[0].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct2)
                    textView.text = "${semesterMarks[1].subject} (${semesterMarks[1].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk2)
                    textView.text = semesterMarks[1].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct3)
                    textView.text = "${semesterMarks[2].subject} (${semesterMarks[2].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk3)
                    textView.text = semesterMarks[2].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct4)
                    textView.text = "${semesterMarks[3].subject} (${semesterMarks[3].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk4)
                    textView.text = semesterMarks[3].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct5)
                    textView.text = "${semesterMarks[4].subject} (${semesterMarks[4].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk5)
                    textView.text = semesterMarks[4].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct6)
                    textView.text = "${semesterMarks[5].subject} (${semesterMarks[5].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk6)
                    textView.text = semesterMarks[5].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct7)
                    textView.text = "${semesterMarks[6].subject} (${semesterMarks[6].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk7)
                    textView.text = semesterMarks[6].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct8)
                    textView.text = "${semesterMarks[7].subject} (${semesterMarks[7].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk8)
                    textView.text = semesterMarks[7].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct9)
                    textView.text = "${semesterMarks[8].subject} (${semesterMarks[8].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk9)
                    textView.text = semesterMarks[8].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct15)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk15)
                    textView.text = " "
                }
                else if (smstr[selectedItemPosition] == "8"){
                    val semesterMarks = runBlocking(Dispatchers.IO) {
                        roomRepositoryImpl.getSemesterMarks(Id.long, smstr[selectedItemPosition].toLong())
                    }
                    textView = findViewById(com.example.lktsu.R.id.sbjct1)
                    textView.text = "${semesterMarks[0].subject} (${semesterMarks[0].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk1)
                    textView.text = semesterMarks[0].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct2)
                    textView.text = "${semesterMarks[1].subject} (${semesterMarks[1].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk2)
                    textView.text = semesterMarks[1].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct3)
                    textView.text = "${semesterMarks[2].subject} (${semesterMarks[2].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk3)
                    textView.text = semesterMarks[2].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct4)
                    textView.text = "${semesterMarks[3].subject} (${semesterMarks[3].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk4)
                    textView.text = semesterMarks[3].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct5)
                    textView.text = "${semesterMarks[4].subject} (${semesterMarks[4].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk5)
                    textView.text = semesterMarks[4].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct6)
                    textView.text = "${semesterMarks[5].subject} (${semesterMarks[5].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk6)
                    textView.text = semesterMarks[5].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct7)
                    textView.text = "${semesterMarks[6].subject} (${semesterMarks[6].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk7)
                    textView.text = semesterMarks[6].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct8)
                    textView.text = "${semesterMarks[7].subject} (${semesterMarks[7].event})"
                    textView = findViewById(com.example.lktsu.R.id.mrk8)
                    textView.text = semesterMarks[7].mark
                    textView = findViewById(com.example.lktsu.R.id.sbjct9)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk9)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk10)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk11)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk12)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk13)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk14)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.sbjct15)
                    textView.text = " "
                    textView = findViewById(com.example.lktsu.R.id.mrk15)
                    textView.text = " "
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    fun onClickInfo(view: View?) {
        val text = "Для просмотра результатов за другие семестры щелкните по номеру и выберите нужный из выпадающего списка"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}