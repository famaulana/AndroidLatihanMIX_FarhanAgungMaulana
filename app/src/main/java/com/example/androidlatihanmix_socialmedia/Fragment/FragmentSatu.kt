package com.example.androidlatihanmix_socialmedia.Fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidlatihanmix_socialmedia.Logout
import com.example.androidlatihanmix_socialmedia.R
import kotlinx.android.synthetic.main.fr_satu.*

class FragmentSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bar_profile.setOnClickListener {
            startActivity(Intent(activity, Logout::class.java))
        }
    }

    companion object {
        fun newInstance(): FragmentSatu {
            val fragment = FragmentSatu()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}