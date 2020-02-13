package com.example.yhquzb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.yhquzb.adapter.Myadapter;
import com.example.yhquzb.interfaces.MyListener;
import com.example.yhquzb.model.ListData;

import java.util.ArrayList;
import java.util.List;

public class BoshActivitiy extends AppCompatActivity implements MyListener {

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

    String[] jarimaTuri = new String[]{
            "Kameralar qayd etgan qoida buzilishlari uchun jarima",
            "125-modda 1-qism Transport vositalaridan foydalanish qoidalarini buzish",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "portugaliya",
            "Rossiya",
            "shimoliy koreya",
            "tojikiston",
            "turkiya",
            "ukraina",
            "uruguay",
            "Uzbekistan",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam"
    };

    String[] Yolhq_Turi = new String[]{
            "Kameralar qayd etgan qoida buzilishlari uchun jarima",
            "125-modda 1-qism Transport vositalaridan foydalanish qoidalarini buzish",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik koreya",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik"
    };
    int[] yolbel = new int[]{
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

    String[] Yolbel_Turi = new String[]{
            "Kameralar qayd etgan qoida buzilishlari uchun jarima",
            "125-modda 1-qism Transport vositalaridan foydalanish qoidalarini buzish",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "portugaliya",
            "Rossiya",
            "shimoliy koreya",
            "tojikiston",
            "turkiya",
            "ukraina",
            "uruguay",
            "Uzbekistan",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam",
            "vietnam"
    };


    int[] Tranfoy = new int[]{
            R.drawable.transfoy,
            R.drawable.transfoy,
            R.drawable.transfoy,
            R.drawable.transfoy,
            R.drawable.transfoy,
            R.drawable.transfoy
    };

    String[] Transfoy_Turi = new String[]{
            "Tormoz tizimi",
            "Boshqaruv qurilmasi",
            "Tashqi yoritgichla",
            "Oyna tozalagich va oyna yuvgich",
            "Shinalar",
            "Yurgizgich",
            "Transport vositasi tuzilishi"
    };
    int[] Ypx = new int[]{
            R.drawable.yhq,
            R.drawable.yhq,
            R.drawable.yhq,
            R.drawable.yhq,
            R.drawable.yhq

    };

    String[] Ypx_Turi = new String[]{
            "Kameralar qayd etgan qoida buzilishlari uchun jarima",
            "125-modda 1-qism Transport vositalaridan foydalanish qoidalarini buzish",
            "125-modda 2-qism Ro'yhattan o'tkazilmgan yoki majburiy texnik ko'rik",
            "fffffffffffff",
            "Rffffffff",
            "ffffffffffffff"

    };
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<ListData> list;
    Button button;
    int status;
    private Context context;
    private List<ListData> listData;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitiybosh);
        button = findViewById(R.id.jarima);
        recyclerView = findViewById(R.id.list_view);
        recyclerView.setHasFixedSize(true);
        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        status = bundle.getInt("Id");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listShow();
        adapter = new Myadapter(this, list);
        recyclerView.setAdapter(adapter);

    }

    private void listShow() {
        list = new ArrayList<>();
        if (status == 1) {
            for (int i=0;i<19;i++){
            list.add(new ListData(i+1+". "+ jarimaTuri[i], Jarima[i]));}
        }
        if (status == 2) {
                for (int i=0;i<15;i++){
                    list.add(new ListData(i+1+". "+ jarimaTuri[i], R.drawable.yhq));}
        }
        if (status == 3) {
            for (int i=0;i<7;i++){
                list.add(new ListData(i+1+". "+Yolbel_Turi[i], R.drawable.yolbelgilari));}
        }if (status == 4) {
                list.add(new ListData(1+". "+"Tik chiziqlar", R.drawable.yolchiziq));
            list.add(new ListData(2+". "+"Yotiq chiziqlar", R.drawable.yolchiziq));
        }if (status == 5) {
                list.add(new ListData(1+". "+"Hududiy raqam kodi", R.drawable.nomer));
            list.add(new ListData(2+". "+"Davlat raqam belgilari", R.drawable.nomer));
        }if (status == 6) {
            list.add(new ListData("Tibbiot qutida bo'lishi shart bo'lgan zarur tibbiy ashyolar ro'yhati", R.drawable.birinchiy));
            list.add(new ListData(1+". "+"Qoidalari va talablari", R.drawable.birinchiy));
            list.add(new ListData(2+". "+"Holatlar", R.drawable.birinchiy));
            list.add(new ListData(3+". "+"Jarohatlanganlarni chiqarish", R.drawable.birinchiy));
            list.add(new ListData(4+". "+"Qanday yordam berish", R.drawable.birinchiy));
        }if (status == 7) {
            for (int i=0;i<6;i++){
                list.add(new ListData(i+1+". "+Transfoy_Turi[i], Tranfoy[i]));}
        }if (status == 8) {
            for (int i=0;i<5;i++){
                list.add(new ListData(i+1+". "+Ypx_Turi[i],R.drawable.danh));}
        }
    }

    @Override
    public void nextActivity(int id) {
        Intent intent = new Intent(context, OhirActivity.class);
       intent.putExtra("Id", id);
        context.startActivity(intent);
        // todo next activity ni codini shotta yozasan
    }



}
