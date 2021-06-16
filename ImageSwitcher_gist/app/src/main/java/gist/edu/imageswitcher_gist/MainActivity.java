package gist.edu.imageswitcher_gist;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    int [] images = {R.drawable.acunit,R.drawable.add_alert,R.drawable.brightness,
    R.drawable.nchor_24};
    int position =-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSwitcher = findViewById(R.id.imgs1);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView =new ImageView(MainActivity.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });
    }

    public void previous(View view) {
        if(position<images.length-1){
            position=position+1;
            imageSwitcher.setBackgroundResource(images[position]);
        }
    }

    public void next(View view) {
        if (position>0){
            position=position-1;
            imageSwitcher.setBackgroundResource(images[position]);
        }
    }
}