package com.example.numberlistlibrary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NumberListActivity : AppCompatActivity() {

    companion object {
        private const val EXTRA_NUMBERS = "extra_numbers"

        fun createIntent(context: Context, numbers: List<Int>): Intent {
            return Intent(context, NumberListActivity::class.java).apply {
                putIntegerArrayListExtra(EXTRA_NUMBERS, ArrayList(numbers))
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = RecyclerView(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        setContentView(recyclerView)

        val numbers = intent.getIntegerArrayListExtra(EXTRA_NUMBERS) ?: listOf()
        recyclerView.adapter = NumberAdapter(numbers)
    }
}
