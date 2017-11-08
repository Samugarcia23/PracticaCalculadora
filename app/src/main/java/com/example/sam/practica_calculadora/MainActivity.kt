package com.example.sam.practica_calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //resultsTextView.setText("14 max numbers")
    }

    fun numero(v: View) {
        val numer = findViewById<Button>(v.id)
        val textnum = numer.text.toString()
        if (textnum.equals("@+id/button")) {
            resultsTextView.text = "${resultsTextView.text.toString()}"
        }
        if (textnum.equals("@+id/buttondot")) {
            resultsTextView.text = "${resultsTextView.text.toString()}"
        }
        resultsTextView.text = "${resultsTextView.text.toString()}${textnum}"
    }

    fun delete(v: View) {
        resultsTextView.setText("")
        activar ()
    }


    fun imagen(v: View) {
        val numer = findViewById<ImageButton>(v.id)
        val textnum = numer.id.toString()
        //do {
            if (textnum.equals("2131165233")) {

                resultsTextView.text = "${resultsTextView.text.toString()}${"/"}"
                buttonSubtract.setEnabled(false)
                buttonAddition.setEnabled(false)
                buttonMultiply.setEnabled(false)
                buttonDivide.setEnabled(false)
            }
            if (textnum.equals("2131165235")) {

                resultsTextView.text = "${resultsTextView.text.toString()}${"*"}"
                buttonSubtract.setEnabled(false)
                buttonAddition.setEnabled(false)
                buttonDivide.setEnabled(false)
                buttonMultiply.setEnabled(false)
            }
            if (textnum.equals("2131165237")) {

                resultsTextView.text = "${resultsTextView.text.toString()}${"-"}"
                buttonDivide.setEnabled(false)
                buttonAddition.setEnabled(false)
                buttonMultiply.setEnabled(false)
                buttonSubtract.setEnabled(false)
            }
            if (textnum.equals("2131165230")) {

                resultsTextView.text = "${resultsTextView.text.toString()}${"+"}"
                buttonSubtract.setEnabled(false)
                buttonDivide.setEnabled(false)
                buttonMultiply.setEnabled(false)
                buttonAddition.setEnabled(false)
            }
        //}while(!resultsTextView.equals(""))

    }

    fun hexf() {
        resultsTextView.setText("")
        buttona.setEnabled(false)
        buttonb.setEnabled(false)
        buttonc.setEnabled(false)
        buttond.setEnabled(false)
        buttone.setEnabled(false)
        buttonf.setEnabled(false)
    }

    fun binario(v: View) {
        resultsTextView.setText("")
        hexf()
        button2.setEnabled(false)
        button3.setEnabled(false)
        button4.setEnabled(false)
        button5.setEnabled(false)
        button6.setEnabled(false)
        button7.setEnabled(false)
        button8.setEnabled(false)
        button9.setEnabled(false)
        buttondot.setEnabled(false)
    }

    fun normal(v: View) {
        resultsTextView.setText("")
        hexf()
        button2.setEnabled(true)
        button3.setEnabled(true)
        button4.setEnabled(true)
        button5.setEnabled(true)
        button6.setEnabled(true)
        button7.setEnabled(true)
        button8.setEnabled(true)
        button9.setEnabled(true)
        buttondot.setEnabled(true)
        buttonMultiply.setEnabled(true)
        buttonDivide.setEnabled(true)
        buttonAddition.setEnabled(true)
        buttonSubtract.setEnabled(true)
    }

    fun hex(v: View) {
        resultsTextView.setText("")
        button1.setEnabled(true)
        button2.setEnabled(true)
        button3.setEnabled(true)
        button4.setEnabled(true)
        button5.setEnabled(true)
        button6.setEnabled(true)
        button7.setEnabled(true)
        button8.setEnabled(true)
        button9.setEnabled(true)
        buttona.setEnabled(true)
        buttonb.setEnabled(true)
        buttonc.setEnabled(true)
        buttond.setEnabled(true)
        buttone.setEnabled(true)
        buttonf.setEnabled(true)
        buttondot.setEnabled(false)
    }

    fun hexsololand(v: View) {
        resultsTextView.setText("Land Mode Only")
    }

    fun binsololand(v: View) {
        resultsTextView.setText("Land Mode Only")
    }

    var memoria: Double = 0.0

    fun mmas(v: View) {
        if (!resultsTextView.getText().equals("")) {
            memoria += resultsTextView.getText().toString().toDouble()
            resultsTextView.setText("")
            resultsTextView.setText("" + memoria)
        }
    }

    fun mmenos(v: View) {
        if (!resultsTextView.getText().equals("")) {
            memoria -= resultsTextView.getText().toString().toDouble()
            resultsTextView.setText("")
            resultsTextView.setText("" + memoria)
        }
    }

    fun mclear(v: View) {
        if (memoria != 0.0) {
            memoria = 0.0
            resultsTextView.setText("")
            resultsTextView.setText("Memory Clear")
        }

    }

    fun activar (){
        buttonDivide.setEnabled(true)
        buttonMultiply.setEnabled(true)
        buttonAddition.setEnabled(true)
        buttonSubtract.setEnabled(true)
    }
        var n1 = 0.0
        var n2 = 0.0
        var res = 0.0

        fun calcular(v: View) {
            val textnum = resultsTextView.text.toString()
            if (textnum.contains("*")) {
                n1 = resultsTextView.text.toString().substring(0, textnum.lastIndexOf("*")).toDouble()
                n2 = resultsTextView.text.toString().substring(textnum.lastIndexOf("*") + 1, textnum.length).toDouble()
                res = n1 * n2
                resultsTextView.text = res.toString()
            } else
                if (textnum.contains("/")) {
                    if (n2 != 0.0) {
                        n1 = resultsTextView.text.toString().substring(0, textnum.lastIndexOf("/")).toDouble()
                        n2 = resultsTextView.text.toString().substring(textnum.lastIndexOf("/") + 1, textnum.length).toDouble()
                        res = n1 / n2
                        resultsTextView.text = res.toString()
                    } else {resultsTextView.setText("Can't Divide 0")}
                } else
                    if (textnum.contains("+")) {
                        n1 = resultsTextView.text.toString().substring(0, textnum.lastIndexOf("+")).toDouble()
                        n2 = resultsTextView.text.toString().substring(textnum.lastIndexOf("+") + 1, textnum.length).toDouble()
                        res = n1 + n2
                        resultsTextView.text = res.toString()
                    } else
                        if (textnum.contains("-")) {
                            n1 = resultsTextView.text.toString().substring(0, textnum.lastIndexOf("-")).toDouble()
                            n2 = resultsTextView.text.toString().substring(textnum.lastIndexOf("-") + 1, textnum.length).toDouble()
                            res = n1 - n2
                            resultsTextView.text = res.toString()
                        }
            activar()
        }

    }
