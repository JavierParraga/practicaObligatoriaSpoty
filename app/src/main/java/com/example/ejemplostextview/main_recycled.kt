package com.example.ejemplostextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplostextview.adapter.Recycled_Adapted
import com.example.ejemplostextview.model.Canciones

class main_recycled : AppCompatActivity() {
    lateinit var mRecyclerView:RecyclerView
    val mAdapter :Recycled_Adapted =Recycled_Adapted(getCanciones(),this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycled)
        setUpRecyclerView()

    }
    fun setUpRecyclerView(){
        mRecyclerView = findViewById(R.id.recycled)
        mRecyclerView.adapter = mAdapter
        mRecyclerView.layoutManager = LinearLayoutManager(this)
    }
    fun getCanciones(): MutableList<Canciones>{
      var canciones:MutableList<Canciones> = ArrayList()
        canciones.add(Canciones("Calle 13","Atreve-te-te",R.drawable.calle13,R.raw.calle13m))
        canciones.add(Canciones("Camela","Cuando zarpa el amor",R.drawable.camelajpg,R.raw.camelam))
        canciones.add(Canciones("Chimbala","Rueda",R.drawable.chimbala,R.raw.chimbalam))
        canciones.add(Canciones("Daddy jankee","limbo",R.drawable.daddyyankee,R.raw.daddyyankem))
        canciones.add(Canciones("David Bisbal","Si tu la quieres",R.drawable.davidbisbal,R.raw.davidbisbalm))
        canciones.add(Canciones("Doja Cat","Opa yo viace un corra",R.drawable.dojacat,R.raw.dojacatm))
        canciones.add(Canciones("El Kola","Say so",R.drawable.ekoala,R.raw.koalam))
        canciones.add(Canciones("Fito Fitipaldis","La casa por el tejado",R.drawable.fitofiti,R.raw.fitofitim))
        canciones.add(Canciones("Lerica","Flamenkito",R.drawable.flamenkito,R.raw.flamenkitom))
        canciones.add(Canciones("Juan Magan","Bailando por ahi",R.drawable.juanmagan,R.raw.juanmaganm))
        return canciones
    }
}