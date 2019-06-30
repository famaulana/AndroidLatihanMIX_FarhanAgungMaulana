package com.example.androidlatihanmix_socialmedia.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidlatihanmix_socialmedia.R

class FragmentLima : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_lima, container, false)
    }

    companion object {
        fun newInstance(): FragmentLima {
            val fragment = FragmentLima()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}