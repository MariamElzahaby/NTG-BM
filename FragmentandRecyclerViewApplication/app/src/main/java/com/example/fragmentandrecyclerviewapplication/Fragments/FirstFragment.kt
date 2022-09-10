package com.example.fragmentandrecyclerviewapplication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentandrecyclerviewapplication.R
import com.example.fragmentandrecyclerviewapplication.RecyclerView.UserClickInterface
import com.example.fragmentandrecyclerviewapplication.RecyclerView.UsersAdapter
import com.example.fragmentandrecyclerviewapplication.UserData.User
import com.example.fragmentandrecyclerviewapplication.UserData.mock

class FirstFragment(private val userClickInterface: UserClickInterface) : Fragment() {
    private lateinit var usersRecyclerView : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        usersRecyclerView = view.findViewById(R.id.rv_first_fragment)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

private fun setupRecyclerView(){
    usersRecyclerView.apply {
        layoutManager = LinearLayoutManager(requireContext())
        adapter = UsersAdapter(usersList = mock.usersList, userClickInterface)

    }


}


}