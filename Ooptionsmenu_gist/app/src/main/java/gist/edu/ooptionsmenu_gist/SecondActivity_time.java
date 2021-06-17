package gist.edu.ooptionsmenu_gist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class SecondActivity_time extends AppCompatActivity {
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        timePicker = findViewById(R.id.timepicker1);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                Toast.makeText(SecondActivity_time.this, "Time:"+i+":"+i1, Toast.LENGTH_SHORT).show();
            }
        });




    }
}