package com.janidu.cardwatcherapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.janidu.creditcardwatcher.CardCVCEditText
import com.janidu.creditcardwatcher.CardExpDateEditText
import com.janidu.creditcardwatcher.CardImageView
import com.janidu.creditcardwatcher.CardNumberEditText

/**This is for demonstration purpose only.
 * you can try your own, according to your requirement. **/

class AddCardActivity: AppCompatActivity(), View.OnClickListener {
    lateinit var cardNumber: CardNumberEditText
    lateinit var cardExpNumber: CardExpDateEditText
    lateinit var cardCvcNumber: CardCVCEditText
    lateinit var cardImage: CardImageView
    lateinit var number:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_card)
        initUI()

        val textNumWatcher = CardNumberEditText(this)
        cardNumber.addTextChangedListener(textNumWatcher)

        val textEXPWatcher = CardExpDateEditText(this)
        cardExpNumber.addTextChangedListener(textEXPWatcher)

        val textCVCWatcher = CardCVCEditText(this)
        cardCvcNumber.addTextChangedListener(textCVCWatcher)

        cardNumber.addTextChangedListener {
            var type =  cardNumber.checkCardType()
            number = cardNumber.text.toString()

            cardImage.changeImage(type)

        }
    }

    private fun initUI(){
        cardNumber = findViewById(R.id.et_cardNumber)
        cardExpNumber = findViewById(R.id.et_cardExpDate)
        cardCvcNumber = findViewById(R.id.et_cardCvcNumber)
        cardImage = findViewById(R.id.iv_card)
        findViewById<Button>(R.id.btn_add_card).setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        when(p0?.id){

            R.id.btn_add_card ->{

                val intent = Intent(this,ViewAddedCardActivity::class.java)
                intent.putExtra("CARD_NUMBER",number)
                startActivity(intent)
            }
        }
    }

}