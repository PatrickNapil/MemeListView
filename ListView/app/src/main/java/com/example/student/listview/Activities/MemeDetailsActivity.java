package com.example.student.listview.Activities;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.student.listview.Models.Meme;
import com.example.student.listview.R;

/**
 * Created by student on 2/14/15.
 */
public class MemeDetailsActivity extends ActionBarActivity{

    Meme memeObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.details_layout);

        memeObj = (Meme) this.getIntent().getExtras().getSerializable(Meme.KEY);

        TextView nameTextView = (TextView) findViewById(R.id.meme_name_textview);
        TextView descTextView = (TextView) findViewById(R.id.meme_desc_textview);
        ImageView picImageView = (ImageView) findViewById(R.id.meme_pic_imageview);
        nameTextView.setText(memeObj.getName());
        descTextView.setText(memeObj.getDescription());
        picImageView.setImageResource(memeObj.getImage_ref());
    }

}
