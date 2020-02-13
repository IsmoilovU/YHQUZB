package com.example.yhquzb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yhquzb.adapter.Myadapter;
import com.example.yhquzb.interfaces.MyListener;
import com.example.yhquzb.model.ListData;

import java.util.ArrayList;

import static com.example.yhquzb.R.id.image;
import static com.example.yhquzb.R.id.jarima;
import static com.example.yhquzb.R.id.rasm;
import static com.example.yhquzb.R.id.yhq;

public class OhirActivity extends AppCompatActivity implements MyListener {
    int[] Jarima = new int[]{
            R.drawable.jarima1,
            R.drawable.jarima2,
            R.drawable.jarima3,
            R.drawable.jarima4,
            R.drawable.jarima6,
            R.drawable.jarima7,
            R.drawable.jarima8,
            R.drawable.jarima9,
            R.drawable.jarima10,
            R.drawable.jarima11,
            R.drawable.jarima12,
            R.drawable.jarima13,
            R.drawable.jarima14,
            R.drawable.jarima15,
            R.drawable.jarima16,
            R.drawable.jarima17,
            R.drawable.jarima18,
            R.drawable.jarima19,
            R.drawable.jarima20
    };
    ArrayList<ListData> list1;
    Bundle extras;
    RecyclerView.Adapter adapter;
    RecyclerView recyclerView;
    TextView textView;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohir);
        extras=getIntent().getExtras();
        recyclerView=findViewById(R.id.lisst_view);
      // recyclerView.setLayoutManager(new LinearLayoutManager(this));
      // adapter=new Myadapter(this ,list1);
       // recyclerView.setAdapter(adapter);
        textView=findViewById(R.id.text);
        //int id = extras.getInt("Id");

        //if (id==0){
            textView.setText("llllalalalalalaalal");
        //}
    }

    @Override
    public void nextActivity(int id) {
        if (id==1){
        textView.setText("dljjjjjjjjjjjjjjjjjjjjjjldcmldcmlkdmclmdlcm");
        }
    }
}
