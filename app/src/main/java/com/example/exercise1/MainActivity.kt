package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(){
            val carPrice = editTextCarPrice.text.toString()
            val downPayment = editTextDownPayment.text.toString()
            val loanPeriod = editTextLoanPeriod.text.toString()
            val interestRate = editTextInterestRate.text.toString()

            val carLoan:Double = carPrice.toDouble() - downPayment.toDouble()
            val interest:Double = carLoan * (interestRate.toDouble()/100) * loanPeriod.toDouble()
            val monthly:Double = (carLoan+interest)/loanPeriod.toDouble()/12

            textViewLoan.text = "Loan = %.2f".format(carLoan)
            textViewInterest.text = "Interest = %.2f".format(interest)
            textViewMonthlyRepayment.text = "Monthly repayment = %.2f".format(monthly)
        }
        buttonReset.setOnClickListener(){
            editTextCarPrice.setText("")
            editTextDownPayment.setText("")
            editTextLoanPeriod.setText("")
            editTextInterestRate.setText("")
            //
            //
            //
        }
    }

}
