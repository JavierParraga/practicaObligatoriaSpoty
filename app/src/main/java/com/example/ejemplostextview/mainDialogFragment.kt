package com.example.ejemplostextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_dialog_fragment.*

class mainDialogFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dialog_fragment)
        dialogo.setOnClickListener(){
            var dialog =DialogFragment()
            dialog.isCancelable = false
            dialog.show(supportFragmentManager,"customDialog")
        }
    }
}