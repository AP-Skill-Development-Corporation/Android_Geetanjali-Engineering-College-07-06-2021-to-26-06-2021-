package gist.edu.countapp_gist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text1);
    }

    public void mCount(View view) {
        count++;
        textView.setText(""+count);
    }

    public void mToast(View view) {
        /*Toast is display message  in particular duration*/
        Toast.makeText(this,"Hai Students",Toast.LENGTH_LONG).show();
    }
}