package com.example.know_hope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ContactUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }

    public void tweetClick( View view ){
        goToUrl("https://twitter.com/hopeeverywhere_");
    }

    public void fbClick(View view){
        goToUrl("https://www.facebook.com/hopeofpeopleeverywhere/");
    }

    public void instaClick(View view){
        goToUrl("https://www.instagram.com/hope.everywhere/?hl=en");
    }

    private void goToUrl(String url){
        Intent viewIntent =
                new Intent("android.intent.action.VIEW",
                        Uri.parse(url));
        startActivity(viewIntent);
    }


}