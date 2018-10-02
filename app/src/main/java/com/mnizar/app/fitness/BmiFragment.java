package com.mnizar.app.fitness;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class BmiFragment extends Fragment {

    @BindView(R.id.berat)
    EditText berat;
    @BindView(R.id.tinggi)
    EditText tinggi;
    @BindView(R.id.calculator)
    Button calculator;
    @BindView(R.id.bmiResult)
    TextView bmiResult;
    Unbinder unbinder;

    public BmiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bmi, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.calculator)
    public void calculateBMI(View v) {

        if (berat.getText().toString().length() > 0 && tinggi.getText().toString().length() > 0) {
            float heightValue = Float.valueOf(tinggi.getText().toString()) / 100;
            float weightValue = Float.valueOf(berat.getText().toString());

            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);
        }
        else {
            Toast.makeText(getActivity(), "Anda Harus Memasukkan Berat Badan dan Tinggi Badan", Toast.LENGTH_SHORT).show();
        }
    }

    private void displayBMI(float bmi) {
        String bmiLabel = "";

        if (Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18.5f) <= 0) {
            bmiLabel = getString(R.string.bbkurang);
        } else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <= 0) {
            bmiLabel = getString(R.string.bbideal);
        } else if (Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 30f) <= 0) {
            bmiLabel = getString(R.string.bblebih);
        } else if (Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <= 0) {
            bmiLabel = getString(R.string.gemuk);
        } else if (Float.compare(bmi, 35f) > 0 && Float.compare(bmi, 40f) <= 0) {
            bmiLabel = getString(R.string.sangatgemuk);
        } else {
            bmiLabel = getString(R.string.sangatgemuk);
        }
        bmiLabel = bmi + "\n\n" + bmiLabel;
        bmiResult.setText(bmiLabel);
    }

}
