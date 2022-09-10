package com.example.fragmentandrecyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentandrecyclerviewapplication.Fragments.FirstFragment
import com.example.fragmentandrecyclerviewapplication.Fragments.SecondFragment
import com.example.fragmentandrecyclerviewapplication.RecyclerView.UserClickInterface
import com.example.fragmentandrecyclerviewapplication.UserData.User

class MainActivity : AppCompatActivity() , UserClickInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment(this)
        supportFragmentManager.beginTransaction()
        .add(R.id.fcv_mainFragment,firstFragment)
        .commit()

    }

    override fun onClickedText(user: User) {
         val secondFragment = SecondFragment(user)
        supportFragmentManager.beginTransaction()
        .replace(R.id.fcv_mainFragment,secondFragment)
        .addToBackStack(SecondFragment::class.java.simpleName)
        .commit()
    }


}