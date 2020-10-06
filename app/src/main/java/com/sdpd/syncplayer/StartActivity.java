package com.sdpd.syncplayer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class StartActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        nav=(NavigationView)findViewById(R.id.navmenu);



        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.cast:
                        Intent i = new Intent(StartActivity.this, CastingActivity.class);
                        startActivity(i);
                        break;
                    case R.id.meeting:
                        Intent j =new Intent(StartActivity.this,MeetingActivity.class);
                        startActivity(j);
                        break;
                    case R.id.autosync:
                        Intent intent = new Intent(StartActivity.this,MainActivity.class);
                        startActivity(intent);
                        break;

                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
