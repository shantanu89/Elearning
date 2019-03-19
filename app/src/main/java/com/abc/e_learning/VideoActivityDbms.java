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

public class VideoActivityDbms extends YouTubeBaseActivity
{
    private static final String TAG4 = "VideoActivity";
    YouTubePlayerView mYouTubePlayerView4;
    Button btnply4;
    YouTubePlayer.OnInitializedListener mOnInitializeListner4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Log.d(TAG4, "onCreate: Starting,");
        btnply4 = (Button) findViewById(R.id.button_videoplay);
        mYouTubePlayerView4= (YouTubePlayerView) findViewById(R.id.viewplayvedio);

        mOnInitializeListner4 = new YouTubePlayer.OnInitializedListener()
        {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
            {
                Log.d(TAG4,"onClick: Done initializing");
                List<String> videoList =  new ArrayList<>();
                videoList.add("oEJMJuFD204");
                videoList.add("c9zR90MU51s");
                videoList.add("coHxp23wTyc");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
            {
                Log.d(TAG4,"onClick: Failed to initializing");
            }
        };

        btnply4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d(TAG4,"onClick: Initializing YouTube Player,");
                mYouTubePlayerView4.initialize(YouTubeConfig.getApi_Key(),mOnInitializeListner4);

            }
        });
    }


}
