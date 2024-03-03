package tr.com.nuritiras.uygulama12sayfa249;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate Çalıştı!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart Çalıştı!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume Çalıştı!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause Çalıştı!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop Çalıştı!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy Çalıştı!");
    }
}