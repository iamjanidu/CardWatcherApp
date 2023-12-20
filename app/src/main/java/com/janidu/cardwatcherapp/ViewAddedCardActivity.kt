package com.janidu.cardwatcherapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.janidu.creditcardwatcher.MaskedCardNumberTextView

class ViewAddedCardActivity: AppCompatActivity() {
    lateinit var viewCardNumber: MaskedCardNumberTextView
    private var number:String?=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_added_cards)
        viewCardNumber = findViewById(R.id.tv_cardNumber)

        number = intent.getStringExtra("CARD_NUMBER")
        Log.e("number",number!!)
        if (number != null) {
            Log.e("number", number!!)
            viewCardNumber.setCardNumber(number!!)
        }
    }

}