package com.mnizar.app.fitness;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

import java.time.DayOfWeek;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReminderActivity extends AppCompatActivity {

    @BindView(R.id.time)
    TextView time;
    @BindView(R.id.timeSwitch)
    Switch timeSwitch;
    @BindView(R.id.deleteBtn)
    ImageButton deleteBtn;
    @BindView(R.id.floatingActionButton)
    FloatingActionButton floatingActionButton;
    @BindView(R.id.repeat)
    TextView repeat;
    @BindView(R.id.day)
    TextView day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.time)
    public void onTimeClicked() {
        Calendar mCurrentTime = Calendar.getInstance();
        int hour = mCurrentTime.get(Calendar.HOUR_OF_DAY);
        int minute = mCurrentTime.get(Calendar.MINUTE);
        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                String curTime = String.format("%02d:%02d", selectedHour, selectedMinute);
                time.setText(curTime);
            }
        }, hour, minute, true);//Yes 24 hour time
        mTimePicker.setTitle("Select Time");
        mTimePicker.show();
    }

    @OnClick({R.id.repeat,R.id.day})
    public void onRepeatClicked() {

    }
}
