package com.ease.oluwasegunwahaabprofile;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout relativeLayout=findViewById(R.id.main_relative_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();

        animationDrawable.setEnterFadeDuration(2500);

        animationDrawable.setExitFadeDuration(4500);

        animationDrawable.start();
    }

    public void alcButtonClickHandler(View view) {
        Intent intent = new Intent(MainActivity.this, AlcWebActivity.class);

        startActivity(intent);
    }

    public void profileButtonClickHandler(View view) {
        Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);

        startActivity(intent);
    }

    public void resumeButtonClickHandler(View view) {
        String intentContent = "https://www.dropbox.com/s/ld6vx6qjfzu9eet/THE%20RESUME-%20Wahaab%20oluwasegun.docx?dl=0";
        Intent shareIntent = new Intent(Intent.ACTION_VIEW);
        shareIntent.setData(Uri.parse(intentContent));
        startActivity(shareIntent);;

    }
}
