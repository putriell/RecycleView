package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    TextView tittle, desc;
    String txtTittle, txtDesc;
    int img;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        txtTittle = bundle.getString("tittle");
        txtDesc = bundle.getString("desc");
        img = bundle.getInt("image");

        tittle = findViewById(R.id.tittle);
        desc = findViewById(R.id.desc);
        image = findViewById(R.id.image);

        tittle.setText(txtTittle);
        desc.setText(txtDesc);

        Glide.with(DetailActivity.this)
                .load(img)
                .apply(new RequestOptions().override(370, 370))
                .into(image);
    }
}