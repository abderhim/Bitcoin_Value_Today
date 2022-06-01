package com.tw.bitcoinpricetoday.views.Bitcoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tw.bitcoinpricetoday.R
import com.tw.bitcoinpricetoday.data.entities.Currency
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BitcoinActivity : AppCompatActivity() {
    private lateinit var bitcoinViewModel: BitcoinViewModel
    lateinit var timeUpdatedTitle: TextView
    lateinit var timeUpdated: TextView
    lateinit var disclaimer: TextView

    lateinit var codeEuro: TextView
    lateinit var rateEuro: TextView

    lateinit var codeDollar: TextView
    lateinit var rateDollar: TextView

    lateinit var codePound: TextView
    lateinit var ratePound: TextView

    lateinit var progressBar: ProgressBar
    lateinit var cardsContainer: RelativeLayout

    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    bitcoinViewModel = ViewModelProvider(this).get(BitcoinViewModel::class.java)

        timeUpdatedTitle = findViewById(R.id.timeUpdatedTitle)
        timeUpdated = findViewById(R.id.timeUpdated)
        disclaimer = findViewById(R.id.disclaimer)

        codeEuro = findViewById(R.id.code)
        rateEuro = findViewById(R.id.rate)

        codeDollar = findViewById(R.id.codeDollar)
        rateDollar = findViewById(R.id.rateDollar)

        codePound = findViewById(R.id.codeGbp)
        ratePound = findViewById(R.id.rateGbp)

        progressBar = findViewById(R.id.progressBar)
        cardsContainer = findViewById(R.id.cardsContainer)


        getBitcoinData()
    }




   fun getBitcoinData(){
       try {
           progressBar.visibility=View.VISIBLE
           bitcoinViewModel.getBitcoinData(this).observe(this) { it ->

               progressBar.visibility=View.GONE

               if (it == null) {
                //
               } else {


                   cardsContainer.visibility=View.VISIBLE
                   timeUpdatedTitle.text= "Last Update: "
                   timeUpdated.text = it.time.updated
                   disclaimer.text= it.disclaimer

                   codeEuro.text = it.bpi?.EUR?.code ?: ""
                   rateEuro.text = it.bpi?.EUR?.rate ?: ""

                   codeDollar.text = it.bpi?.USD?.code ?: ""
                   rateDollar.text = it.bpi?.USD?.rate ?: ""

                   codePound.text = it.bpi?.GBP?.code ?: ""
                   ratePound.text = it.bpi?.GBP?.rate ?: ""
               }
           }
       } catch (e: Exception) {

       }
    }
}