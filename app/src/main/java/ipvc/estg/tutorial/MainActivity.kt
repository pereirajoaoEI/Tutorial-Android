package ipvc.estg.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        super.onPause()
        Log.d("testeLog", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("testeLog", "onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("testeLog", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("testeLog", "onResume")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("testeLog", "onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("testeLog", "onRestart")
    }
}