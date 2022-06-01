package com.tw.bitcoinpricetoday.data.repositories

import com.tw.bitcoinpricetoday.data.entities.BitcoinData
import com.tw.bitcoinpricetoday.data.network.BitcoinAPI
import javax.inject.Inject

class CurrencyValueRepositoy @Inject constructor(private val api: BitcoinAPI)  {

    suspend fun getBitcoinData(): BitcoinData
    {
            return api.getBitcoinValue()
    }
}