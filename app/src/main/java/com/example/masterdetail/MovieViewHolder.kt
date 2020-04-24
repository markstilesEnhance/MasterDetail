package com.example.masterdetail

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(movie: Movie, clickListener: (Movie) -> Unit) {
        itemView.item_title.text = movie.title
        itemView.item_year.text = movie.year.toString()
        itemView.setOnClickListener { clickListener(movie) }
    }

}
