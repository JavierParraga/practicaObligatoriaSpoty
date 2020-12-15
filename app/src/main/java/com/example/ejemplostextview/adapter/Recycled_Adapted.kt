package com.example.ejemplostextview.adapter

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplostextview.R
import com.example.ejemplostextview.model.Canciones

class Recycled_Adapted(private val album: MutableList<Canciones>,private var context: Context): RecyclerView.Adapter<Recycled_Adapted.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recycled_Adapted.ViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.custom_list,parent,false))
    }

    override fun getItemCount(): Int {
        return album.size
    }

    override fun onBindViewHolder(holder: Recycled_Adapted.ViewHolder, position: Int) {
        val cancion: Canciones = album.get(position)
        holder.bind(cancion,context)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val nombre = view.findViewById(R.id.title) as TextView
        val descripcion = view.findViewById(R.id.description) as TextView
        val imagen = view.findViewById(R.id.icon) as ImageView

        fun bind(canciones: Canciones , context:Context){
            nombre.text = canciones.nombre
            descripcion.text =  canciones.descripcion
            imagen.setImageResource(canciones.imagen)
            itemView.setOnClickListener(){
                var sonido = MediaPlayer.create(context,canciones.cancion)
                sonido.setVolume(1f,0.5f)
                sonido.start()
            }
        }
    }
}