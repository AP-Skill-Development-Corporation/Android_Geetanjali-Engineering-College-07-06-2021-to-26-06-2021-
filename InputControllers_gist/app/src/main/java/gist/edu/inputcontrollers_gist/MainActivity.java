package gist.edu.inputcontrollers_gist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*InputControls : are used design the UI of an
    * application we have a wide variety  of input controls
    * available.
    * Those are TextView,EditText,Button,Checkbox,progressbar,
    * spinner,togglebuttons,switch etc...*/
    ImageButton imageButton;
    RadioGroup rg;
    RadioButton radio1,radio2;
    Switch aSwitch;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linear1);
        aSwitch = findViewById(R.id.switch1);
        rg = findViewById(R.id.rg1);
        radio1 = findViewById(R.id.rb1);
        radio2 = findViewById(R.id.rb2);
        imageButton = findViewById(R.id.img1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb1:
                        Toast.makeText(MainActivity.this, "Male",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(MainActivity.this, "Female",
                                Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Selected Image",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void changColor(View view) {
        if(aSwitch.isChecked()){
            linearLayout.setBackgroundColor(Color.GREEN);
        }else{
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
    }
}