package com.example.basickotlindecoding

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUi().setContentView(this)
    }

    class MainActivityUi : AnkoComponent <MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>)  = with(ui) {

            verticalLayout{

                padding = dip (16)

                val name = editText() {
                    hint = "What's your name ?"
                }

                button ("Say Hello"){
                    textColor = Color.WHITE
                    setOnClickListener {
                        snackbar("Hello, ${name.text}!")
                    }
                }.lparams(width = matchParent){
                    topMargin = dip(5)
                }

                button("Show Alert") {
                    textColor = Color.WHITE
                    setOnClickListener {
                        alert ("Josss", "Heloo,${name.text}"){
                            yesButton { snackbar("Oh") }
                            noButton {  }
                        }.show()
                    }
                }.lparams(width = matchParent){
                    topMargin = dip(5)
                }

                button("Next") {
                    textColor = Color.WHITE

                    setOnClickListener {
                        startActivity<SecondActivity>("name" to "${name.text}")
                    }
                }.lparams(width = matchParent){
                    topMargin = dip(5)
                }
            }
        }

    }
}
