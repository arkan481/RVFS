package com.example.kotlinfs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    // assign nya nanti
//    // var value nya dynamic
//    private lateinit var noteModel: NoteModel
//
//    // assign nya langsung
//    // val, value nya konstan ga bisa berubah
//    private val noteModel2 = NoteModel()

    // 1. Pertama kasih id masing2 view y
    private lateinit var noteModels: ArrayList<NoteModel>
    private lateinit var rvMainNoteAdapter: RVMainNoteAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateRV()

        btn_note_insert.setOnClickListener {
            addNote()
        }
    }

    private fun populateRV() {
        noteModels = ArrayList()

        rvMainNoteAdapter = RVMainNoteAdapter(noteModels)
        recycler.adapter = rvMainNoteAdapter

    }

    private fun addNote() {
        noteModels.add(NoteModel(et_note.text.toString()))

        rvMainNoteAdapter.notifyDataSetChanged()
    }
}