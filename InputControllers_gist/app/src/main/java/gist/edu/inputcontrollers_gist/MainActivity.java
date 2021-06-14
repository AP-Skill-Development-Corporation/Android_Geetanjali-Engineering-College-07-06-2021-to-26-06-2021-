package gist.edu.inputcontrollers_gist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

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
    CheckBox checkBox1,checkBox2,checkBox3;
    Spinner spinner;
    List<String> weeks;
    AutoCompleteTextView autoct;
    List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = findViewById(R.id.check1);
        checkBox2 = findViewById(R.id.check2);
        checkBox3 = findViewById(R.id.check3);
        linearLayout = findViewById(R.id.linear1);
        aSwitch = findViewById(R.id.switch1);
        rg = findViewById(R.id.rg1);
        radio1 = findViewById(R.id.rb1);
        radio2 = findViewById(R.id.rb2);
        imageButton = findViewById(R.id.img1);
        spinner = findViewById(R.id.spinner1);
        weeks = new ArrayList<>();
        weeks.add("Sunday");
        weeks.add("Monday");
        weeks.add("Tuesday");
        weeks.add("WednesDay");
        weeks.add("Thursday");
        weeks.add("Friday");
        weeks.add("saturday");
        autoct = findViewById(R.id.act1);
        names = new ArrayList<>();
        names.add("krishna");
        names.add("anusha");
        names.add("pavan");
        names.add("sreekanth");
        names.add("sunil");
        names.add("meghana");
        names.add("eagle");
        names.add("doctor");
        names.add("baby");
        names.add("murthy");
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,names);
        autoct.setAdapter(adapter1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,weeks);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You Selected: "+
                        weeks.get(i),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

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

    public void selectbleItems(View view) {
        StringBuffer result = new StringBuffer();
        if(checkBox1.isChecked()){
            result.append(checkBox1.getText());
        }if(checkBox2.isChecked()){
            result.append("\n"+checkBox2.getText());

        }
        if(checkBox3.isChecked()){
            result.append("\n"+checkBox3.getText());
        }
        if(checkBox1.isChecked()||checkBox2.isChecked()||checkBox3.isChecked()){
            Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();
        }
    }
}