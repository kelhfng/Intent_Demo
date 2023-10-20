package hk.hkuspace.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val extras = intent.extras ?:return
        val messageFromMainActivity = extras.getString("message")
        val luckyNumber = extras.getInt("luckyNumber")
        val luckyNumberTV = findViewById<TextView>(R.id.luckyNumberTV)

        luckyNumberTV.text = luckyNumber.toString()
        Log.d("test", messageFromMainActivity.toString())
        Log.d("test", luckyNumber.toString())
    }
}