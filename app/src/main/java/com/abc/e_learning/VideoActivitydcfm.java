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

public class VideoActivitydcfm extends YouTubeBaseActivity
{
    private static final String TAG1 = "VideoActivity";
    YouTubePlayerView mYouTubePlayerView1;
    Button btnply1;
    YouTubePlayer.OnInitializedListener mOnInitializeListner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Log.d(TAG1, "onCreate: Starting,");
        btnply1= (Button) findViewById(R.id.button_videoplay);
        mYouTubePlayerView1= (YouTubePlayerView) findViewById(R.id.viewplayvedio);

        mOnInitializeListner = new YouTubePlayer.OnInitializedListener()
        {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
            {
                Log.d(TAG1,"onClick: Done initializing");
                List<String> videoList =  new ArrayList<>();
                videoList.add("AaN72s5WfOM");
                videoList.add("wx0NyUfpm48");
                videoList.add("uiKKRPZbuXA");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
            {
                Log.d(TAG1,"onClick: Failed to initializing");
            }
        };

        btnply1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d(TAG1,"onClick: Initializing YouTube Player,");
                mYouTubePlayerView1.initialize(YouTubeConfig.getApi_Key(),mOnInitializeListner);

            }
        });
    }


}
