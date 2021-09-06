package com.example.cardviewandintentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private  var cardView1: CardView? = null
    private  var cardView2: CardView? = null
    private  var cardView3: CardView? = null

    var shirts: Array<String> = arrayOf("สีน้ำเงิน","สีแดง","สีขาว")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardView1 = findViewById(R.id.CardView1)
        cardView2 = findViewById(R.id.CardView2)
        cardView3 = findViewById(R.id.CardView3)

        cardView1!!.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Order", shirts[0])
            startActivity(intent)

        }
        cardView2!!.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Order", shirts[1])
            startActivity(intent)
        }
        cardView3!!.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Order", shirts[2])
            startActivity(intent)
        }
    }
}