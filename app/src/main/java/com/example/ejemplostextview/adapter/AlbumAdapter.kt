package com.example.ejemplostextview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.ejemplostextview.R
import com.example.ejemplostextview.model.AlbumItem

class AlbumAdapter(var context: Context, var arrayList: ArrayList<AlbumItem>):BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var view:View = View.inflate(context,R.layout.card_view_item_albun,null)
        var icons:ImageView = view.findViewById(R.id.icons)
        var name:TextView = view.findViewById(R.id.textView)
        var listItem:AlbumItem=arrayList.get(position)
        icons.setImageResource(listItem.icons!!)
        name.text = listItem.name
        return view

    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
      return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }
}