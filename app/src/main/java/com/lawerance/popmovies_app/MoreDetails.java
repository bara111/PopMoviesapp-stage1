package com.lawerance.popmovies_app;


import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;

import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


import com.bumptech.glide.Glide;

import com.lawerance.popmovies_app.MoviesAPI.Result;


public class MoreDetails extends AppCompatActivity {
    private ImageView mPosterimageView, mBackdropimageView;
    private TextView mTitle, mOriginalLanguage, mReleaseDate, mVoteAverage, mOverview, trailerText;

    private Result result;
    private MenuItem mItem;
    private boolean MoviedFounded;
    private static final String MOVIE_API_KEY = "9e83a1425b48215d005e8817dc0d95ee";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);

        trailerText = findViewById(R.id.Trailers);
        Intent intent = getIntent();
        result = intent.getParcelableExtra("result");
        String Title = result.getOriginalTitle();
        String OriginalLanguage = result.getOriginalLanguage();
        String ReleaseDate = result.getReleaseDate();
        String BackdropPath = result.getBackdropPath();
        String VoteAverage = result.getVoteAverage();
        String PosterPath = result.getPosterPath();
        String Overview = result.getOverview();

        mOverview = findViewById(R.id.tv_overview);
        mPosterimageView = findViewById(R.id.iv_poster_image);
        mBackdropimageView = findViewById(R.id.iv_background_image);
        mTitle = findViewById(R.id.tv_title);
        mOriginalLanguage = findViewById(R.id.tv_language);
        mReleaseDate = findViewById(R.id.tv_date);
        mVoteAverage = findViewById(R.id.tv_rating);
        mTitle.setText(Title);
        mOverview.setText(Overview);
        mOriginalLanguage.setText(OriginalLanguage);
        mReleaseDate.setText(ReleaseDate);
        mVoteAverage.setText(VoteAverage);

        Glide
                .with(this)
                .load("https://image.tmdb.org/t/p/original" +PosterPath)
                .into(mPosterimageView);
        Glide
                .with(this)
                .load("https://image.tmdb.org/t/p/original" +BackdropPath)
                .into(mBackdropimageView);









    }






}
