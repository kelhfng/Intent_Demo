package hk.hkuspace.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val extras = intent.extras ?:return
        val messageFromMainActivity = extras.getDouble("amount")
        val result = findViewById<TextView>(R.id.result)

        result.text = messageFromMainActivity.toString()
    }
}