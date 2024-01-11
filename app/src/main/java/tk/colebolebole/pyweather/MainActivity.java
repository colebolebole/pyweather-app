package tk.colebolebole.pyweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView  PyWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PyWeather = findViewById(R.id.PyWeather);
        PyWeather.getSettings().setJavaScriptEnabled(true);
        PyWeather.setWebViewClient(new WebViewClient());
        PyWeather.loadUrl("https://pyweather.colebolebole.tk/mobile.html");
    }
}