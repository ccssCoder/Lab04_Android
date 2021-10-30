package com.example.quizapplicationcontinuation1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView3).apply {
            text = message
        }

        Log.i("Info", "DisplayMessageActivity - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Info", "DisplayMessageActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Info","DisplayMessageActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Info","DisplayMessageActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Info","DisplayMessageActivity - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Info","DisplayMessageActivity - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Info","DisplayMessageActivity - onDestroy")
    }
}