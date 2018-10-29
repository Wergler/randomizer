package com.example.java.randomizer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*
import android.widget.SeekBar.OnSeekBarChangeListener



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonRandom = findViewById<Button>(R.id.btnRandom)
        var textResult = findViewById<TextView>(R.id.txtRandom)
        var textRandomRange = findViewById<TextView>(R.id.txtRandomRange)
        var seekBarRandomRange = findViewById<SeekBar>(R.id.skbrRandomRange)


        buttonRandom.setOnClickListener() {
            var ran = Random().nextInt(seekBarRandomRange.progress) + 1
            textResult.text = ran.toString()
        }

        seekBarRandomRange.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
















                                           fromUser: Boolean) {
                //set textView's text
                textRandomRange.setText("Random Number From 0 to " + progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}

        })
      /*  seekBarRandomRange.setOnSeekBarChangeListener( {
            textRandomRange.text = "Random Number From 0 to " + seekBarRandomRange.progress
        })*/


    }
}
