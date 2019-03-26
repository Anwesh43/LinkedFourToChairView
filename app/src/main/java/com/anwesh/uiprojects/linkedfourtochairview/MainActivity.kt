package com.anwesh.uiprojects.linkedfourtochairview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.fourtochairview.FourToChairView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FourToChairView.create(this)
    }
}
