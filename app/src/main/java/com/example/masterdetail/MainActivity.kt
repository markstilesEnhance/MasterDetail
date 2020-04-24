package com.example.masterdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_movie_detail.*


class MainActivity : AppCompatActivity() {

    var movies: MutableList<Movie> = mutableListOf(
            Movie("The Shawshank Redemption", 1994),
            Movie("The Godfather", 1972),
            Movie("The Godfather: Part II", 1974))
    lateinit var adapter: MovieListAdapter
    lateinit var current_detail: MovieDetail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view.layoutManager = LinearLayoutManager(this)
        adapter = MovieListAdapter(movies) { movie: Movie -> clicker(movie) }
        recycler_view.adapter = adapter
    }

    private fun clicker(movie: Movie) {
        if(detail_frame != null) {
                supportFragmentManager.beginTransaction()
                    .addToBackStack("detail")
                    .replace(R.id.detail_frame, MovieDetail.newInstance(movie), "detail")
                    .commit()
            }
        else{
            supportFragmentManager.beginTransaction()
                .addToBackStack("detail")
                .replace(R.id.recycler_frame, MovieDetail.newInstance(movie), "detail")
                .commit()
        }
    }
}
