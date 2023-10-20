package hk.hkuspace.intentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doExchange(v: View){
        val intent = Intent(this, ResultActivity::class.java)

        var amountTV = findViewById<TextView>(R.id.amount)
        var amount = amountTV.text.toString().toDouble()
        intent.putExtra("amount", amount)

        startActivity(intent)
    }
}

