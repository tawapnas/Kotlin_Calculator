package com.example.sanpawatsewsuwan.kotlin_calculator

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isAdd: Boolean = false
    private var isMinus: Boolean = false
    private var isMulti: Boolean = false
    private var isDiv: Boolean = false
    private var isEqual: Boolean = false

    private var isOperator: Boolean = false

    private var value1: Double = 0.0
    private var value2: Double = 0.0
    private var result: Double = 0.0

    private var operator: String=""
    private var ans: String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView4.setText("0")
    }

    fun addOne(view: View){
        if(isOperator|| isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("1")
        }
        else {
            if(textView4.text =="0"){
                textView4.setText("1")
            }
            else{
                textView4.setText(textView4.text.toString() + "1")
            }
        }
    }
    fun addTwo(view: View){
        if(isOperator|| isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("2")
        }
        else {
            if(textView4.text =="0"){
                textView4.setText("2")
            }
            else{
                textView4.setText(textView4.text.toString() + "2")
            }

        }
    }
    fun addThree(view: View){
        if(isOperator|| isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("3")
        }
        else {
            if(textView4.text =="0"){
                textView4.setText("3")
            }
            else{
                textView4.setText(textView4.text.toString() + "3")
            }

        }}
    fun addFour(view: View){
        if(isOperator|| isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("4")
        }
        else {
            if(textView4.text =="0"){
                textView4.setText("4")
            }
            else{
                textView4.setText(textView4.text.toString() + "4")
            }

        }}
    fun addFive(view: View){
        if(isOperator|| isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("5")
        }
        else {
            if(textView4.text =="0"){
                textView4.setText("5")
            }
            else{
                textView4.setText(textView4.text.toString() + "5")
            }

        }
    }
    fun addSix(view: View){
        if(isOperator|| isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("6")
        }
        else {
            if(textView4.text =="0"){
                textView4.setText("6")
            }
            else{
                textView4.setText(textView4.text.toString() + "6")
            }

        }
    }
    fun addSeven(view: View){
        if(isOperator|| isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("7")
        }
        else {
            if(textView4.text =="0"){
                textView4.setText("7")
            }
            else{
                textView4.setText(textView4.text.toString() + "7")
            }

        }
    }
    fun addEight(view: View){
        if(isOperator|| isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("8")
        }
        else {
            if(textView4.text =="0"){
                textView4.setText("8")
            }
            else{
                textView4.setText(textView4.text.toString() + "8")
            }

        }
    }
    fun addNine(view: View){
        if(isOperator|| isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("9")
        }
        else {
            if(textView4.text =="0"){
                textView4.setText("9")
            }
            else{
                textView4.setText(textView4.text.toString() + "9")
            }
        }
    }
    fun addZero(view: View){
        if(isOperator || isEqual){
            isOperator=false
            isEqual=false
            textView4.setText("0")
        }
        else {
            if(textView4.text !="0"){
                textView4.setText(textView4.text.toString() + "0")
            }
        }
    }
    fun plus(view: View){
        if(isOperator==false){
            equal(view)
            operator = "+"
            isOperator = true
            value1 = textView4.text.toString().toDouble()
        }
        if(isOperator==true){
            operator = "+"
        }
    }
    fun minus(view: View){
        if(isOperator==false){
            equal(view)
            operator = "-"
            isOperator = true
            value1 = textView4.text.toString().toDouble()
        }
        if(isOperator==true){
            operator = "-"
        }
    }
    fun multiply(view: View){
        if(isOperator==false){
            equal(view)
            operator = "*"
            isOperator = true
            value1 = textView4.text.toString().toDouble()
        }
        if(isOperator==true){
            operator = "*"
        }
    }
    fun divide(view: View){
        if(isOperator==false){
            equal(view)
            operator = "/"
            isOperator = true
            value1 = textView4.text.toString().toDouble()
        }
        if(isOperator==true){
            operator = "/"
        }
    }
    fun percentage(view: View){
        value1 = textView4.text.toString().toDouble()
        textView4.setText((value1/100).toString())
    }
    fun addDecimal(view: View){
        if(isEqual){
            isEqual=false
            textView4.setText("0.")
        }
        else{
            textView4.setText(textView4.text.toString()+".")
        }

    }
    fun equal(view: View){
        isEqual = true
        if(operator!=""){

            value2 = textView4.text.toString().toDouble()

            if(operator=="+") result = value1+value2
            if(operator=="-") result = value1-value2
            if(operator=="*") result = value1*value2
            if(operator=="/") result = value1/value2

            ans = result.toString()

            if(ans[ans.lastIndex-1]=='.' && ans[ans.lastIndex]=='0'){
                textView4.setText(result.toInt().toString())
            }
            else{
                textView4.setText(result.toString())
            }
        }
        operator=""
    }
    fun clear(view: View){
        value1=0.0
        value2=0.0
        result=0.0
        isAdd=false
        isMinus=false
        isMulti=false
        isDiv=false
        isEqual=false
        isOperator = false
        textView4.setText("0")
        operator=""
    }
    fun posornega(view: View){
        if(textView4.text.toString().toDouble()>0){
            textView4.setText("-"+textView4.text.toString())
        }
        else{
            textView4.setText((textView4.text.toString().toDouble()*-1).toInt().toString())
        }
    }
}
