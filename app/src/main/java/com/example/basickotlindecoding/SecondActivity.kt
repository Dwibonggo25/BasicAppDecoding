package com.example.basickotlindecoding

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.dip
import org.jetbrains.anko.padding
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class SecondActivity : AppCompatActivity () {

    lateinit var nameTextview : TextView
    private var name: String = ""

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        verticalLayout {
            padding = dip (16)

            nameTextview = textView()
        }

        val intent = intent
        name = intent.getStringExtra("name")
        nameTextview.text = name

    }
}