package com.example.masterdetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_movie_detail.*
import kotlinx.android.synthetic.main.fragment_movie_detail.view.*

class MovieDetail(val movie: Movie) : Fragment() {

    companion object{
        fun newInstance(movie2: Movie): MovieDetail{
            return MovieDetail(movie2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_movie_detail, container, false)
        view.detail_title.text = movie.title
        view.detail_year.text = movie.year.toString()
        return view
    }
}
