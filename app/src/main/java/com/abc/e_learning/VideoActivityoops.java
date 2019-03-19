package com.abc.e_learning;

import android.net.Uri;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class VideoActivityoops extends YouTubeBaseActivity
{
    private static final String TAG2 = "VideoActivity";
    YouTubePlayerView mYouTubePlayerView2;
    Button btnply2;
    YouTubePlayer.OnInitializedListener mOnInitializeListner2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Log.d(TAG2, "onCreate: Starting,");
        btnply2 = (Button) findViewById(R.id.button_videoplay);
        mYouTubePlayerView2= (YouTubePlayerView) findViewById(R.id.viewplayvedio);

        mOnInitializeListner2 = new YouTubePlayer.OnInitializedListener()
        {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
            {
                Log.d(TAG2,"onClick: Done initializing");
                List<String> videoList =  new ArrayList<>();
                videoList.add("e1YafrxYOWw");
                videoList.add("XWE3hA4PAoI");
                videoList.add("fta0zpX05vk");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
            {
                Log.d(TAG2,"onClick: Failed to initializing");
            }
        };

        btnply2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d(TAG2,"onClick: Initializing YouTube Player,");
                mYouTubePlayerView2.initialize(YouTubeConfig.getApi_Key(),mOnInitializeListner2);

            }
        });
    }


}
