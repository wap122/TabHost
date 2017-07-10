package com.example.minhl.tabhost;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        // Tab Photo
        TabHost.TabSpec photospec = tabHost.newTabSpec("Photos");
        photospec.setIndicator("Photos", getDrawable(R.drawable.icon));
        Intent photosIntent = new Intent(this, PhotosActivity.class);
        photospec.setContent(photosIntent);

        // Tab Songs
        TabHost.TabSpec songspec = tabHost.newTabSpec("Songs");
        songspec.setIndicator("Songs", getDrawable(R.drawable.icon));
        Intent songsIntent = new Intent(this, SongActivity.class);
        songspec.setContent(songsIntent);

        // Tab Video
        TabHost.TabSpec videospec = tabHost.newTabSpec("Videos");
        videospec.setIndicator("Videos", getDrawable(R.drawable.icon));
        Intent videosIntent = new Intent(this, VideoActivity.class);
        videospec.setContent(videosIntent);

        // Thêm tab vào tabHost
        tabHost.addTab(photospec); // Adding photos tab
        tabHost.addTab(songspec); // Adding songs tab
        tabHost.addTab(videospec); // Adding videos tab

    }
}
