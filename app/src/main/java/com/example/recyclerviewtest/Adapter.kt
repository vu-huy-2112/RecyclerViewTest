package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter : RecyclerView.Adapter<Adapter.UserViewHodel>() {

    var listUser: List<User> = ArrayList()

    fun setData(list: List<User>) {
        this.listUser = list
    }


    public class UserViewHodel(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameVH: TextView = itemView.findViewById(R.id.tvName)
        var ageVH: TextView = itemView.findViewById(R.id.tvAge)

        fun onBindView(user: User) {
            nameVH.text = user.name
            ageVH.text = user.age
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHodel {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return UserViewHodel(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHodel, position: Int) {
        holder.onBindView(listUser.get(position))
    }

    override fun getItemCount(): Int {
        return listUser.size
    }
}