package com.example.recyclerview.data

import com.example.recyclerview.R
import com.example.recyclerview.model.Transactions

class DataSource {
    fun loadTransactions():List<Transactions>{
        return listOf<Transactions>(
            Transactions(R.string.Transaction1),
            Transactions(R.string.Transaction2),
            Transactions(R.string.Transaction3),
            Transactions(R.string.Transaction4),
            Transactions(R.string.Transaction5),
            Transactions(R.string.Transaction6),
            Transactions(R.string.Transaction7),
            Transactions(R.string.Transaction8),
            Transactions(R.string.Transaction9),
            Transactions(R.string.Transaction10),
            Transactions(R.string.Transaction11),
            Transactions(R.string.Transaction12),
            Transactions(R.string.Transaction13),
            Transactions(R.string.Transaction14),
            Transactions(R.string.Transaction15),
            Transactions(R.string.Transaction16),


        )
    }
}