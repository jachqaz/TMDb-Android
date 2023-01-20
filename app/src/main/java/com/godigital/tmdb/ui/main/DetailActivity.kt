package com.godigital.tmdb.ui.main

import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.godigital.tmdb.R
import com.godigital.tmdb.databinding.ActivityDetailBinding
import com.godigital.tmdb.ui.common.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailActivity : BaseActivity() {
    private val detailViewModel: DetailViewModel by viewModels()
    lateinit var activityDetailBinding: ActivityDetailBinding

    override fun getLayoutId(): Int {
        return R.layout.activity_detail
    }

    override fun initView() {
        super.initView()
        activityDetailBinding = this.binding as ActivityDetailBinding
        setSupportActionBar(activityDetailBinding.toolbar)
        supportActionBar?.title = intent.getStringExtra("title")
        activityDetailBinding.tvOverview.text = intent.getStringExtra("overview")
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/${intent.getStringExtra("backdropPath")}")
            .into(activityDetailBinding.ivBackdropPath)
    }
}