package com.example.cardviewandintentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    private var orderTextView: TextView? = null

    private var nameEditText: EditText? = null
    private  var emailEditText: EditText? = null

    private var confirmButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        orderTextView = findViewById(R.id.showOrderTextView)

        // show order from mainActivity
        val intent = intent
        orderTextView!!.text = intent.getStringExtra("Order")

        // EditText
        nameEditText = findViewById<EditText>(R.id.nameEditText)
        emailEditText = findViewById<EditText>(R.id.emailEditText)

        confirmButton = findViewById<Button>(R.id.confirmButton)

        confirmButton!!.setOnClickListener {
            val dataIntent = Intent(this, ConfirmActivity::class.java)
            dataIntent.putExtra("Order", intent.getStringExtra("Order"))
            dataIntent.putExtra("Name", nameEditText!!.text.toString())
            dataIntent.putExtra("Email", emailEditText!!.text.toString())
            startActivity(dataIntent)
        }

    }
}