package com.naman.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i=2;
    public void nextImage(View view)
    {
        i++;
        if(i>6)
            i=2;
        if(i==2)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l2);
        else if(i==3)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l3);
        else if(i==4)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l4);
        else if(i==5)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l5);
        else
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l6);
        String str=Integer.toString(i);
        TextView status = findViewById(R.id.status);
        status.setText(str);
    }
    public void prevImage(View view)
    {
        i--;
        if(i<2)
            i=6;
        if(i==2)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l2);
        else if(i==3)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l3);
        else if(i==4)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l4);
        else if(i==5)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l5);
        else
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.l6);

        String str=Integer.toString(i);
        TextView status = findViewById(R.id.status);
        status.setText(str);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
