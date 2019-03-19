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

public class VideoActivitydf extends YouTubeBaseActivity
{
    private static final String TAG5 = "VideoActivity";
    YouTubePlayerView mYouTubePlayerView5;
    Button btnply5;
    YouTubePlayer.OnInitializedListener mOnInitializeListner5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Log.d(TAG5, "onCreate: Starting,");
        btnply5 = (Button) findViewById(R.id.button_videoplay);
        mYouTubePlayerView5= (YouTubePlayerView) findViewById(R.id.viewplayvedio);

        mOnInitializeListner5 = new YouTubePlayer.OnInitializedListener()
        {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
            {
                Log.d(TAG5,"onClick: Done initializing");
                List<String> videoList =  new ArrayList<>();
                videoList.add("t-z9ds0RKIs");
                videoList.add("S_eLvLOxPmg");
                videoList.add("db9OQgnvj84");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
            {
                Log.d(TAG5,"onClick: Failed to initializing");
            }
        };

        btnply5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d(TAG5,"onClick: Initializing YouTube Player,");
                mYouTubePlayerView5.initialize(YouTubeConfig.getApi_Key(),mOnInitializeListner5);

            }
        });
    }


}
