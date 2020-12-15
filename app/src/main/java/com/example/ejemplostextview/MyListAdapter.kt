package com.example.ejemplostextview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class MyListAdapter(private val context: Activity, private val title: Array<String>,
                    private val description: Array<String>, private val imgid:Array<Int>)
    :ArrayAdapter<String>(context,R.layout.custom_list,title){
    override fun getView(position:Int, view: View?, parent: ViewGroup):View{
        val inflater : LayoutInflater = context.layoutInflater
        val rowView : View =inflater.inflate(R.layout.custom_list,null,true)

        val titleText : TextView = rowView.findViewById(R.id.title) as TextView
        val imageView: ImageView =  rowView.findViewById(R.id.icon) as ImageView
        val subtitleText: TextView = rowView.findViewById(R.id.description) as TextView

        titleText.text = title[position]
        imageView.setImageResource(imgid[position])
        subtitleText.text = description[position]

        return rowView
    }
}