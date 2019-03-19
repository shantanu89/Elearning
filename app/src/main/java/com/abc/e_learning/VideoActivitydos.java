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

public class VideoActivitydos extends YouTubeBaseActivity
{
    private static final String TAG = "VideoActivity";
    YouTubePlayerView mYouTubePlayerView;
    Button btnply;
    YouTubePlayer.OnInitializedListener mOnInitializeListner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Log.d(TAG, "onCreate: Starting,");
        btnply = (Button) findViewById(R.id.button_videoplay);
        mYouTubePlayerView= (YouTubePlayerView) findViewById(R.id.viewplayvedio);

        mOnInitializeListner = new YouTubePlayer.OnInitializedListener()
        {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
            {
                Log.d(TAG,"onClick: Done initializing");
                List<String> videoList =  new ArrayList<>();
                videoList.add("38n4cZeFefo");
                videoList.add("dw889ubtFR8");
                videoList.add("CeEEv-qiMTc");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
            {
                Log.d(TAG,"onClick: Failed to initializing");
            }
        };

        btnply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d(TAG,"onClick: Initializing YouTube Player,");
                mYouTubePlayerView.initialize(YouTubeConfig.getApi_Key(),mOnInitializeListner);

            }
        });
    }


}
