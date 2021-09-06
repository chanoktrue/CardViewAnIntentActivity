package com.example.cardviewandintentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class ConfirmActivity : AppCompatActivity() {

    private var orderTextView: TextView? = null
    private  var nameTextView: TextView? = null
    private  var emailTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        orderTextView = findViewById<TextView>(R.id.showOrderTextView)
        nameTextView = findViewById<TextView>(R.id.showNameTextView)
        emailTextView = findViewById<TextView>(R.id.showEmailTextView)

        val intent = intent
        orderTextView!!.text = intent.getStringExtra("Order")
        nameTextView!!.text = intent.getStringExtra("Name")
        emailTextView!!.text = intent.getStringExtra("Email")
    }
}