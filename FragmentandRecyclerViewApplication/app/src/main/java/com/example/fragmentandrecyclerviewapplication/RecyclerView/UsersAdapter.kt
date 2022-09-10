package com.example.fragmentandrecyclerviewapplication.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentandrecyclerviewapplication.R
import com.example.fragmentandrecyclerviewapplication.UserData.User

class UsersAdapter (
   private val usersList: List<User>,
   private val userClickInterface: UserClickInterface
   ): RecyclerView.Adapter<UsersAdapter.Holder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
                return Holder(view,userClickInterface)
        }
        override fun onBindViewHolder(holder: Holder, position: Int) {
                holder.bind(usersList[position])
        }

        override fun getItemCount(): Int {
                return usersList.size
        }

        class Holder(view: View, userClickInterface: UserClickInterface) : RecyclerView.ViewHolder(view){
            val tv_name : TextView
            val tv_job : TextView
            lateinit var user : User

            init {
                tv_name = view.findViewById(R.id.tv_name)
                tv_job = view.findViewById(R.id.tv_job)
                view.setOnClickListener {
                    userClickInterface.onClickedText(user)
                }
            }
            fun bind (user: User){
                  this.user = user
                  tv_name.text = user.name
                  tv_job.text = user.job
            }

        }
}