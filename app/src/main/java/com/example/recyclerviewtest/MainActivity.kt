package com.example.recyclerviewtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var listUser : ArrayList<User> = ArrayList()
    var adapter : Adapter = Adapter()
    lateinit var rv : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setData()

        adapter.setData(listUser)
        rv = findViewById(R.id.recyclerView)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }

    private fun setData() {
        listUser.add(User(1, "Huy", "23"))
        listUser.add(User(1, "Hoàng", "20"))
        listUser.add(User(1, "Nhung", "23"))
        listUser.add(User(1, "Phong", "28"))
    }
}