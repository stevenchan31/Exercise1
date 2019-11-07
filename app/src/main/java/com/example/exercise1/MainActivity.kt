package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_sub=findViewById(R.id.btn_sub) as Button

        btn_sub.setOnClickListener(){

            cal(it)
        }

    }
    private fun cal(view:View){
        var price = findViewById<EditText>(R.id.price).text.toString()
        var down = findViewById<EditText>(R.id.down).text.toString()
        var loanp = findViewById<EditText>(R.id.Loan).text.toString()
        var rate = findViewById<EditText>(R.id.Rate).text.toString()

        var carloan = price.toDouble() - down.toDouble()
        var interest = carloan.toDouble() * (loanp.toDouble()/100) * rate.toDouble()
        var repayment = (carloan.toDouble() + interest.toDouble()) / loanp.toDouble() / 12

        CarLoan.text="%.2f".format(carloan.toDouble()).toString()
        Interest.text="%.2f".format(interest.toDouble()).toString()
        Repayment.text="%.2f".format(repayment.toDouble()).toString()

    }


}
