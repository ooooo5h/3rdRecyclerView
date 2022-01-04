package com.neppplus.a3rdrecyclerview.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neppplus.a3rdrecyclerview.models.Student

class StudentAdapter(
    val mContext : Context,
    val mList : List<Student>
) : RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

    inner class MyViewHolder(row: View) : RecyclerView.ViewHolder(row){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}