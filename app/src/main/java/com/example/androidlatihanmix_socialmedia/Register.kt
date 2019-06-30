package com.example.androidlatihanmix_socialmedia

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.register.*

class Register : AppCompatActivity() {

    lateinit var fAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        fAuth = FirebaseAuth.getInstance()

        btn_register.setOnClickListener {
            val email = et_email_register.text.toString()
            val password = et_password_register.text.toString()
            if (email.isNotEmpty() || password.isNotEmpty() || !email.equals("") || !password.equals("")) {
                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Registration Success", Toast.LENGTH_SHORT).show()
                        onBackPressed()
                    } else {
                        Toast.makeText(this, "Registration Filed", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Please Fill all", Toast.LENGTH_SHORT).show()
            }
        }

        tv_login.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}