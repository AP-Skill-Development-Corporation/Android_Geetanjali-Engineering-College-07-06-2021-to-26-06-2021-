package gist.edu.ooptionsmenu_gist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent intent = new Intent(this, SecondActivity_time.class);
                startActivity(intent);
                Toast.makeText(this, "Time Picker", Toast.LENGTH_SHORT).show();
         break;
            case R.id.item2:
                Toast.makeText(this, "AlertDialog", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Confirm Exit...");
                builder.setIcon(R.drawable.add_alert);
                builder.setMessage("Are you sure , you want to exit");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
                }
            });
                builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                break;
            case R.id.itmem3:
                Toast.makeText(this, "Datepicker", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                finish();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}