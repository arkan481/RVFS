package com.example.kotlinfs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVMainNoteAdapter(
    // ini parameter note model
    private val noteModels: ArrayList<NoteModel>
) : RecyclerView.Adapter<RVMainNoteAdapter.ViewHolder>() {

    // ini berfungsi untuk membangun view item layout
    // yang diubah cuma nama item yang udh dibuat
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        LayoutInflater.from(parent.context).inflate(R.layout.item_main_note, parent, false).let { view ->
            return ViewHolder(view)
        }
    }

    // ini berfungsi untuk mengikat view item
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = noteModels.get(position).note
    }

    // ini berfungsi untuk set jumlah item recycler
    override fun getItemCount(): Int {
        return noteModels.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textView: TextView

        init {
            textView = itemView.findViewById(R.id.tv_item_note)
        }
    }
}