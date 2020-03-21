package deng.com.layoutpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        TextView top = findViewById(R.id.top);
        ImageView img_top = findViewById(R.id.img_top);
        TextView bottom = findViewById(R.id.bottom);
        ImageView img_bottom = findViewById(R.id.img_bottom);

        TextView center = findViewById(R.id.center);
        ImageView img_center = findViewById(R.id.img_center);
        img_center.setImageDrawable(loadImgFromUrl("https://image.freepik.com/free-icon/home_318-42210.jpg"));

        TextView right = findViewById(R.id.right);
        ImageView img_right = findViewById(R.id.img_right);
        img_right.setImageResource(R.drawable.right);
        TextView left = findViewById(R.id.left);
        ImageView img_left = findViewById(R.id.img_left);
        img_left.setImageResource(R.drawable.left);
    }

    private Drawable loadImgFromUrl(String url){
        try {
            Drawable draw;
            try (InputStream inputStream = (InputStream) new URL(url).getContent()) {
                draw = Drawable.createFromStream(inputStream, "src");
            }
            return draw;
        }catch (Exception e){
            Log.i("loading: ",e.toString());
            return null;
        }
    }

}
