package com.example.quizapplicationcontinuation1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Info", "MainActivity - onCreate")
    }

    fun buttonClickEvent(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.i("Info", "MainActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Info","MainActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Info","MainActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Info","MainActivity - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Info","MainActivity - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Info","MainActivity - onDestroy")
    }
}