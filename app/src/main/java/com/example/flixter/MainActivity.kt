package com.example.flixter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flixter.R.id
/**
 * The MainActivity for the Flixter app.
 * Launches a [LatestMoviesFragment].
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        fragmentTransaction.replace(id.content, LatestMoviesFragment(), null).commit()
    }
}