package com.zastupailo.logger.mvpkotlinnote

import com.activeandroid.query.Delete
import com.activeandroid.query.Select
import java.util.*

/**
 * Created by ang on 27.02.18.
 */
class NoteDao {

    fun createNote(): Note{
        val date = Date()
        var note = Note("new note", date, date)
        note.save()
        return note

    }

    fun saveNote(note : Note) = note.save()

    fun loadAllNotes(noteId: Long) = Select().from(Note::class.java).where("id=?", noteId).executeSingle<Note>()

    fun deleteAllNotes(){
        Delete().from(Note::class.java).execute<Note>()
    }

    fun deleteNote(note: Note){
        note.delete()
    }
}