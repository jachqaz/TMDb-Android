package com.godigital.tmdb.ui.main

import android.content.Intent
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.godigital.tmdb.R
import com.godigital.tmdb.databinding.ActivityMainBinding
import com.godigital.tmdb.domain.model.Movie
import com.godigital.tmdb.ui.common.BaseActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity(), MainAdapter.AdapterListener {
    private val mainViewModel: MainViewModel by viewModels()
    lateinit var activityMainBinding: ActivityMainBinding
    private var movies = arrayListOf<Movie>()

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        super.initView()
        activityMainBinding = this.binding as ActivityMainBinding
        setSupportActionBar(activityMainBinding.toolbar)
        initLiveData()
        activityMainBinding.progressBar.visibility = View.VISIBLE
        mainViewModel.getMovies()
    }

    private fun initLiveData() {
        mainViewModel.liveDataMovie.observe(this) { data ->
            activityMainBinding.progressBar.visibility = View.GONE
            if (data != null) {
                movies.addAll(data)
                activityMainBinding.rvMovie.layoutManager = GridLayoutManager(this, 3)
                activityMainBinding.rvMovie.adapter = MainAdapter(this, this, movies)
            }
        }
    }

    override fun goToDetailsListener(movie: Movie) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("title", movie.title)
        intent.putExtra("backdropPath", movie.backdropPath)
        intent.putExtra("overview", movie.overview)
        startActivity(intent)
    }
}

