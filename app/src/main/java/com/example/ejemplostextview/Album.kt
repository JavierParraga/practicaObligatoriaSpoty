package com.example.ejemplostextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.ejemplostextview.adapter.AlbumAdapter
import com.example.ejemplostextview.model.AlbumItem
import kotlinx.android.synthetic.main.activity_album.*

class Album : AppCompatActivity() {
    private var arrayList:ArrayList<AlbumItem>? = null
    private var gridView: GridView?=null
    private var albumAdapters:AlbumAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album)
        arrayList= ArrayList()
        arrayList=setDataList()
        albumAdapters=AlbumAdapter(applicationContext,arrayList!!)
        grid_Album.adapter = albumAdapters

    }
    private fun setDataList():ArrayList<AlbumItem>{
        var arrayList:ArrayList<AlbumItem> = ArrayList()

        arrayList.add(AlbumItem(R.drawable.aitana,"Aitana"))
        arrayList.add(AlbumItem(R.drawable.camilo,"Camilo"))
        arrayList.add(AlbumItem(R.drawable.coldplay,"ColdPlay"))
        arrayList.add(AlbumItem(R.drawable.dualipa,"Dua Lipa"))
        arrayList.add(AlbumItem(R.drawable.karol,"Karol G"))
        arrayList.add(AlbumItem(R.drawable.maluma,"Maluma"))
        arrayList.add(AlbumItem(R.drawable.patricio,"Don Patricio"))
        arrayList.add(AlbumItem(R.drawable.sidecars,"Sidecars"))
        arrayList.add(AlbumItem(R.drawable.weeknd,"The Weeknd"))

        return arrayList
    }
}