package com.example.androidlatihanmix_socialmedia

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.account.*

class Logout : AppCompatActivity() {

    private lateinit var fAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)

        fAuth = FirebaseAuth.getInstance()

        btn_logout_account.setOnClickListener {
            fAuth.signOut()
            startActivity(Intent(this, Login::class.java))
            finish()
        }
    }

}