package com.flower_rec_pack.tflite;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class flower_page extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String id = null;
        if (extras != null) {
            id = extras.getString("flower_id");
        }
        if(id.equals("10")){ //Flower vered
            setContentView(R.layout.flower_vered_page);
        }
        else if (id.equals("12")) {
            setContentView(R.layout.flower_hinanit_page); //Hinanit

        }
        else if (id.equals("13")) {
            setContentView(R.layout.flower_sunflower_page);

        }
        else if (id.equals("14")) {
            setContentView(R.layout.flower_cohav_reihani_page); //Cohav

        }
        else if (id.equals("15")) {
            setContentView(R.layout.flower_curcom_page);

        }
        else if (id.equals("16")) {
            setContentView(R.layout.flower_calanit_page);

        }
        else if (id.equals("617")) {
            setContentView(R.layout.flower_lashon_shor_page);

        }
        else if (id.equals("18")) {
            setContentView(R.layout.flower_narkis_page);

        }
        else if (id.equals("19")) {
            setContentView(R.layout.flower_savion_page);

        }
        else if (id.equals("0")) {
            setContentView(R.layout.flower_sahlevan_page);

        }
        else if (id.equals("1")) {
            setContentView(R.layout.flower_sitvanit_page);

        }
        else if (id.equals("2")) {
            setContentView(R.layout.flower_olesh_page);

        }
        else if (id.equals("3")) {
            setContentView(R.layout.flower_tzivoni_page);

        }
        else if (id.equals("4")) {
            setContentView(R.layout.flower_cat_page);

        }
        else if (id.equals("5")) {
            setContentView(R.layout.flower_kipodan_page);

        }
        else if (id.equals("6")) {
            setContentView(R.layout.flower_rakephet_page);

        }
        else if (id.equals("7")) {
            setContentView(R.layout.flower_shosan_page);

        }
        else if (id.equals("8")) {
            setContentView(R.layout.flower_shinan_page);

        }
        else if (id.equals("9")) {
            setContentView(R.layout.flower_shaked_page);

        }
        else if (id.equals("11")) {
            setContentView(R.layout.flower_turmus_page);

        }
        else{ // default value for compelation
            setContentView(R.layout.flower_vered_page);

        }

        setupHyperlink();
    }
    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.wikiHyperLink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }


}

