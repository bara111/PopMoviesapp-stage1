package com.lawerance.popmovies_app.MoviesAPI;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.google.gson.annotations.SerializedName;

public class Result implements Parcelable {

    public static final String LOG_TAG = Result.class.getSimpleName();


    @SerializedName("id")
    private int id;

    @SerializedName("vote_average")
    private String voteAverage;

    @SerializedName("title")
    private String originalTitle;

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("overview")
    private String overview;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("original_language")
    private String originalLanguage;


    public Result() {

    }

    public Result(int id, String voteAverage, String originalTitle, String backdropPath, String overview, String releaseDate, String posterPath, String originalLanguage) {
        this.id = id;
        this.voteAverage = voteAverage;
        this.originalTitle = originalTitle;
        this.backdropPath = backdropPath;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.posterPath = posterPath;
        this.originalLanguage = originalLanguage;
    }

    protected Result(Parcel in) {
        id = in.readInt();
        voteAverage = in.readString();
        originalTitle = in.readString();
        backdropPath = in.readString();
        overview = in.readString();
        releaseDate = in.readString();
        posterPath = in.readString();
        originalLanguage = in.readString();
    }

    public static final Creator<Result> CREATOR = new Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        @Override
        public Result[] newArray(int size) {
            return new Result[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(voteAverage);
        parcel.writeString(originalTitle);
        parcel.writeString(backdropPath);
        parcel.writeString(overview);
        parcel.writeString(releaseDate);
        parcel.writeString(posterPath);
        parcel.writeString(originalLanguage);
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getBackdropPath() {

        return backdropPath;

    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Nullable
    public String getPosterPath() {
        return  posterPath;

    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

}
