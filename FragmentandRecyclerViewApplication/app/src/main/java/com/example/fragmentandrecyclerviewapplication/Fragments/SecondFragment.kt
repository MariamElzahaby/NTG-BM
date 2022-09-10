package com.example.fragmentandrecyclerviewapplication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmentandrecyclerviewapplication.R
import com.example.fragmentandrecyclerviewapplication.UserData.User

class SecondFragment(private val user: User) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tv_username = view.findViewById<TextView>(R.id.tv_username)
        tv_username.text = user.name

        val tv_userjob = view.findViewById<TextView>(R.id.tv_userjob)
        tv_userjob.text = user.job

        val tv_usermobile = view.findViewById<TextView>(R.id.tv_usermobile)
        tv_usermobile.text = user.mobileNum

        val tv_useraddress = view.findViewById<TextView>(R.id.tv_useraddress)
        tv_useraddress.text = user.address

        val tv_useremail = view.findViewById<TextView>(R.id.tv_useremail)
        tv_useremail.text = user.email
    }
}