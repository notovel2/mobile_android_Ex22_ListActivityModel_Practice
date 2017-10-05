package com.egci428.ex_listactivitymodel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_detail.*
import android.view.Menu
import java.text.NumberFormat


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val bundle = intent.extras
        titleText.text = bundle.getString("title")
        descriptionText.text = bundle.getString("desc")
        courseNoText.text = bundle.getString("number")
        creditsText.text = bundle.getString("credits")
        val res = resources.getIdentifier("${bundle.getString("image")}","drawable",this.packageName)
        imageCourse.setImageResource(res)

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        finish()
        return true
    }
}
