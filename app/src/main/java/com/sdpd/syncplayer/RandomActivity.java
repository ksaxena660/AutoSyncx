package com.sdpd.syncplayer;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class RandomActivity extends AppCompatActivity {
    String[] listItems;
    Button mBtn;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        mBtn = findViewById(R.id.btn_btn);
        mTextView = findViewById(R.id.text1);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listItems = new String[]{"Stream Over Internet","Play in Sync"};
                AlertDialog.Builder mBuilder =  new AlertDialog.Builder(RandomActivity.this);
                mBuilder.setTitle("Choose preffered way of Streaming");
                mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mTextView.setText(listItems[i]);
                        dialogInterface.dismiss();
                    }
                });
                mBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        Button video = (Button)findViewById(R.id.btn_video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent("android.media.action.VIDEO_CAMERA");
                startActivity(inte);
            }
        });
    }
}
