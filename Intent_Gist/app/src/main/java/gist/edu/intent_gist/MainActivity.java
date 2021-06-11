package gist.edu.intent_gist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText  et1,et2;
    Intent intent = null,chooser=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.edit1);
        et2 = findViewById(R.id.edit2);
    }

    public void submit(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public void gotoBrowser(View view) {
        String data = et1.getText().toString();
        Uri uri = Uri.parse("https:\\www."+data+".com");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void launchEmail(View view) {

         intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        String[] to={"krishnaapssdc@gmail.com","svkrishna.p@apssdc.in"};
        intent.putExtra(Intent.EXTRA_EMAIL,to);
        intent.putExtra(Intent.EXTRA_SUBJECT,"FirstEmail");
        intent.putExtra(Intent.EXTRA_TEXT,"Hai This is First Email Msg");
        intent.setType("message/rfc822");
        chooser = Intent.createChooser(intent,"SendEmail");
        startActivity(chooser);
    }

    public void passData(View view) {
        String fname = et2.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("FNAME",fname);
        startActivity(intent);
    }
}