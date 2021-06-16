package gist.edu.fragments_gist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
/*Fragment is a part of activity it is also known as  a sub activity
* by which  we can display screens on one activity
* A fragment has  its own layout and its own behaviour with its own lifecycles.*/
   boolean status = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadFragments(View view) {
        if(!status){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.framelayout1,new Fragmentone()).commit();
            status=true;
        }else{
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.framelayout1,new FragmentTwo()).commit();
            status=false;
        }
    }
}