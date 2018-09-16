package com.mnizar.app.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OnRepsActivity extends AppCompatActivity {

    @BindView(R.id.instructionImage)
    ImageView instructionImage;
    @BindView(R.id.floatingActionButton)
    FloatingActionButton fab;
    @BindView(R.id.jenis)
    TextView jeniss;
    @BindView(R.id.instruksi)
    TextView instruksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_reps);
        ButterKnife.bind(this);

        getDb();
    }

    public void getDb(){
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        String jenis = jeniss.getText().toString();
        String instruction = databaseAccess.getInstruction(jenis);

        instruksi.setText(instruction);

        databaseAccess.close();
    }

    @OnClick(R.id.floatingActionButton)
    public void onBtnClicked() {
        Intent intent = new Intent(this, FinishActivity.class);
        startActivity(intent);
    }

}
