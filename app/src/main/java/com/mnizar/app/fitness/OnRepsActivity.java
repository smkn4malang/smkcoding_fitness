package com.mnizar.app.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class OnRepsActivity extends AppCompatActivity {

/*
    @BindView(R.id.instructionImage)
    ImageView instImg;
    @BindView(R.id.view_flipper)
    ViewFlipper vf;
*/
    @BindView(R.id.floatingActionButton)
    FloatingActionButton fab;
    @BindView(R.id.exercise)
    TextView latihan;
    @BindView(R.id.gif)
    GifImageView gif;
    @BindView(R.id.instruksi)
    TextView instruksi;

    Intent intent;
    int urutan = 0;
/*
    int[] situp = {R.drawable.situp_1, R.drawable.situp_2};
    int[] cobra = {R.drawable.cobra};
    int[] legraise = {R.drawable.legraise_1,R.drawable.legraise_2};
    int[] tricepdip = {R.drawable.tricepdip_1,R.drawable.tricepdip_2};
    int[][] images = new int[][]{situp,legraise,tricepdip,cobra};

    GifDrawable situp = new GifDrawable(getAssets(),"situp.gif");
    GifDrawable legraises = new GifDrawable(getAssets(),"legraises.gif");
    GifDrawable tricepdips = new GifDrawable(getAssets(),"tricepdips.gif");
    GifDrawable cobra = new GifDrawable(getAssets(),"kobra.gif");
    GifDrawable[] images = new GifDrawable[]{situp,legraises,tricepdips,cobra};
*/
    int[] images = new int[]{R.drawable.situp,R.drawable.legraises,R.drawable.tricepdips,R.drawable.kobra};

    String[] instruction = new String[]{
            "Berbaringlah dengan tangan dilipat di belakang kepala anda. Lalu angkat badan bagian" +
                    "atas anda sejauh mungkin dari lantai.\nPerlahan kembali ke posisi berbaring dan ulangi gerakan",
            "Berbaringlah dan letakkan tangan di bawah pinggul anda untuk mendukung.\n" +
                    "Lalu angkat kedua kaki ke atas dengan lurus, hingga membentuk sudut yang tepat dengan lantai.",
            "Kedua tangan memegang kursi dan menumpu tubuh anda.\nPerlahan tekuk lengan anda dan " +
                    "turunkan pinggul anda mendekati lantai. Ulangi sampai perulangan yang ditentukan",
            "Tengkurap dan tekuk siku ada dengan telapak tangan di bawah bahu anda.\n" +
                    "Lalu dorong dada anda ke atas sejauh mungkin dari lantai. Kembali ke posisi semula dan ulangi",
    };

    String[] exercise = new String[]{
            "Sit-Up 10x",
            "Angkat Kaki 15x",
            "Tricep Dip 20x",
            "Kobra 10x",
    };

    public OnRepsActivity() throws IOException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_reps);
        ButterKnife.bind(this);

/*
        for(int i = 0; i < situp.length; i++){
            this.instImg.setImageResource(situp[i]);
            vf.addView(this.instImg);
        }

        vf.setAutoStart(true);
        vf.setInAnimation(null);
        vf.setOutAnimation(null);
        vf.setFlipInterval(1000);
*/
        gif.setImageResource(images[urutan]);
        latihan.setText(exercise[urutan]);
        instruksi.setText(instruction[urutan]);
    }

    public void finishReps() {
        Intent finish = new Intent();
        setResult(RESULT_OK, finish);
        finish();
    }

    public void next(View view) {
        urutan++;
        if (urutan < exercise.length){
            gif.setImageResource(images[urutan]);
            latihan.setText(exercise[urutan]);
            instruksi.setText(instruction[urutan]);
        }else {
            intent = new Intent(getApplicationContext(), FinishActivity.class);
            startActivity(intent);
            finishReps();
        }
    }

}
