package com.flower_rec_pack.tflite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class flower_list_activity extends AppCompatActivity {

    private ImageButton calanit;
    private ImageButton vered;
    private ImageButton hinanit;
    private ImageButton sunflower;
    private ImageButton cohav;
    private ImageButton curcom;
    private ImageButton lashon;
    private ImageButton narkis;
    private ImageButton savion;
    private ImageButton sahlavan;
    private ImageButton sitvanit;
    private ImageButton olesh;
    private ImageButton zivoni;
    private ImageButton cat;
    private ImageButton kipod;
    private ImageButton rakefet;
    private ImageButton shoshan;
    private ImageButton shinan;
    private ImageButton shaked;
    private ImageButton turmus;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flower_list_page);
        calanit = findViewById(R.id.calanit);
        calanit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_calanit = new Intent(flower_list_activity.this, flower_page.class);
                intent_calanit.putExtra("flower_id","16");
                startActivity(intent_calanit);
            }
        });
        vered = findViewById(R.id.vered);
        vered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_vered = new Intent(flower_list_activity.this, flower_page.class);
                intent_vered.putExtra("flower_id","10");
                startActivity(intent_vered);
            }
        });
        hinanit  = findViewById(R.id.hinanit);
        hinanit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_hinanit = new Intent(flower_list_activity.this, flower_page.class);
                intent_hinanit.putExtra("flower_id","12");
                startActivity(intent_hinanit);
            }
        });
        sunflower  = findViewById(R.id.sunflower);
        sunflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_sunflower = new Intent(flower_list_activity.this, flower_page.class);
                intent_sunflower.putExtra("flower_id","13");
                startActivity(intent_sunflower);
            }
        });
        cohav  = findViewById(R.id.cohav);
        cohav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_cohav = new Intent(flower_list_activity.this, flower_page.class);
                intent_cohav.putExtra("flower_id","14");
                startActivity(intent_cohav);
            }
        });
        curcom  = findViewById(R.id.curcom);
        curcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_curcom = new Intent(flower_list_activity.this, flower_page.class);
                intent_curcom.putExtra("flower_id","15");
                startActivity(intent_curcom);
            }
        });
        lashon  = findViewById(R.id.lashon);
        lashon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_lashon = new Intent(flower_list_activity.this, flower_page.class);
                intent_lashon.putExtra("flower_id","17");
                startActivity(intent_lashon);
            }
        });

        narkis  = findViewById(R.id.narkis);
        narkis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_narkis = new Intent(flower_list_activity.this, flower_page.class);
                intent_narkis.putExtra("flower_id","18");
                startActivity(intent_narkis);
            }
        });
        savion  = findViewById(R.id.savion);
        savion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_savion = new Intent(flower_list_activity.this, flower_page.class);
                intent_savion.putExtra("flower_id","19");
                startActivity(intent_savion);
            }
        });
        sahlavan  = findViewById(R.id.sahlevan);
        sahlavan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_sahlavan = new Intent(flower_list_activity.this, flower_page.class);
                intent_sahlavan.putExtra("flower_id","0");
                startActivity(intent_sahlavan);
            }
        });
        sitvanit  = findViewById(R.id.sitvanit);
        sitvanit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_sitvanit = new Intent(flower_list_activity.this, flower_page.class);
                intent_sitvanit.putExtra("flower_id","1");
                startActivity(intent_sitvanit);
            }
        });
        olesh  = findViewById(R.id.olesh);
        olesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_olesh = new Intent(flower_list_activity.this, flower_page.class);
                intent_olesh.putExtra("flower_id","2");
                startActivity(intent_olesh);
            }
        });
        zivoni   = findViewById(R.id.zivoni);
        zivoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_zivoni = new Intent(flower_list_activity.this, flower_page.class);
                intent_zivoni.putExtra("flower_id","3");
                startActivity(intent_zivoni);
            }
        });
        cat  = findViewById(R.id.ziporen);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_cat = new Intent(flower_list_activity.this, flower_page.class);
                intent_cat.putExtra("flower_id","4");
                startActivity(intent_cat);
            }
        });
        kipod  = findViewById(R.id.kipod);
        kipod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_kipod = new Intent(flower_list_activity.this, flower_page.class);
                intent_kipod.putExtra("flower_id","5");
                startActivity(intent_kipod);
            }
        });
        rakefet  = findViewById(R.id.rekefet);
        rakefet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_rakefet = new Intent(flower_list_activity.this, flower_page.class);
                intent_rakefet.putExtra("flower_id","6");
                startActivity(intent_rakefet);
            }
        });
        shoshan  = findViewById(R.id.shoshan);
        shoshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_shoshan = new Intent(flower_list_activity.this, flower_page.class);
                intent_shoshan.putExtra("flower_id","7");
                startActivity(intent_shoshan);
            }
        });
        shinan  = findViewById(R.id.shinan);
        shinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_shinan = new Intent(flower_list_activity.this, flower_page.class);
                intent_shinan.putExtra("flower_id","8");
                startActivity(intent_shinan);
            }
        });
        shaked  = findViewById(R.id.shaked);
        shaked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_shaked = new Intent(flower_list_activity.this, flower_page.class);
                intent_shaked.putExtra("flower_id","9");
                startActivity(intent_shaked);
            }
        });
        turmus  = findViewById(R.id.turmus);
        turmus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_turmus = new Intent(flower_list_activity.this, flower_page.class);
                intent_turmus.putExtra("flower_id","11");
                startActivity(intent_turmus);
            }
        });

    }


}
