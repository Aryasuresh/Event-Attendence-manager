package com.sample.attendence

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.*

import kotlinx.android.synthetic.main.activity_event.*
import org.jetbrains.anko.intentFor

class EventsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       val n= MenuInflater(this).inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId) {
            R.id.logout -> {
                val pref = getSharedPreferences("events", 0)
                val editor = pref.edit()

                editor.putString("access_token", "")
                editor.apply()
                startActivity(intentFor<LoginActivity>())
                finish()

            }
            R.id.about -> {

            }
        }
            return super.onOptionsItemSelected(item)

    }



    }

