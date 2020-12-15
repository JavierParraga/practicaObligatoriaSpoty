package com.example.ejemplostextview

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val language = arrayOf<String>("Calle 13", "Camela","Chimbala","Daddy Yankee",
        "David Bisbal", "Doja Cat", "El Kola", "Fito Fitipaldis", "Lerica","Juan Magan" )
    val descripcion = arrayOf<String>("Atreve-te-te","Cuando zarpa el amor","Rueda",
        "Limbo","Si tu la quieres", "Say so", "Opa yo viace un corra\'","La casa por el tejado","Flamenkito", "Bailando por ahi")
    val imageId = arrayOf(R.drawable.calle13,R.drawable.camelajpg,R.drawable.chimbala,R.drawable.daddyyankee,
        R.drawable.davidbisbal,R.drawable.dojacat,R.drawable.ekoala,R.drawable.fitofiti,R.drawable.flamenkito,R.drawable.juanmagan)
    val musicId = arrayOf(R.raw.calle13m, R.raw.camelam,R.raw.chimbalam,R.raw.daddyyankem,R.raw.davidbisbalm,
        R.raw.dojacatm,R.raw.koalam,R.raw.fitofitim,R.raw.flamenkitom,R.raw.juanmaganm)
    var sonido : MediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val myListAdapter = MyListAdapter(this,language,descripcion,imageId)
        listView.adapter = myListAdapter
        listView.setOnItemClickListener(){adapterView,view,position,id ->
           var pos = position
            val itemAtPos:Any = adapterView.getItemAtPosition(position)
            val itemIdAsPos: Long = adapterView.getItemIdAtPosition(position)
            sonido = MediaPlayer.create(this,musicId[pos])
            sonido.setVolume(1f,0.5f)
            sonido.start()
            Toast.makeText(this,"Click on item at $itemAtPos its item id $itemIdAsPos",
            Toast.LENGTH_LONG).show()

            anterior.setOnClickListener(){
                if(pos > 0){
                    pos --
                }
                sonido.stop()
                sonido = MediaPlayer.create(this,musicId[pos])
                sonido.start()
            }
            playpause.setOnClickListener(){
                sonido.stop()
            }
            siguiente.setOnClickListener(){
                if(pos <10){
                    pos ++
                }
                sonido.stop()
                sonido = MediaPlayer.create(this,musicId[pos])
                sonido.start()
            }
        }

    }



}