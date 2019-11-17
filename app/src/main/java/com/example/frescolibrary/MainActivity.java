package com.example.frescolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse("https://images.pexels.com/photos/556667/pexels-photo-556667.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260&fbclid=IwAR2EG59Urpb-UGxMDZQnApuNaIWBz4zVYUhKqNdqeMDwcCQQS5d4qoJNaaA");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.image);
        draweeView.setImageURI(uri);

    }
}
