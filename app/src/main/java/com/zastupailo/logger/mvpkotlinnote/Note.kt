package com.zastupailo.logger.mvpkotlinnote

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import java.util.*

/**
 * Created by ang on 27.02.18.
 */
class Note : Model{

    @Column(name = "title")
    public var title: String? = null
    @Column(name = "text")
    public var text: String? = null
    @Column(name = "create_date")
    public var createDate: Date? = null
    @Column(name = "change_date")
    public var changeDate: Date? = null

    constructor(title: String, createDate: Date, changeDate: Date){
        this.title = title
        this.createDate = createDate
        this.changeDate = changeDate
    }

    constructor()

    fun getInfo(): String = "Name:\n$title\n"+
            "Creation time:\n${formatDate(createDate)}\n" +
            "Change time:\n${formatDate(changeDate)}"

    private fun formatDate(createDate: Date?): String = "formate date"
}