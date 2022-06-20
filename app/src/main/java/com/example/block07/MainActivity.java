package com.example.block07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;



public class MainActivity extends AppCompatActivity {
     NumberPicker possibilities;
     WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        webView=(WebView)findViewById(R.id.webview);

        String [] possibilitiesStrings= {
                "Page One",
                "Page 2",
                "Page 3",
                "Page 4"
        };
        possibilities.setDisplayedValues(possibilitiesStrings);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesStrings.length-1);

    }

    public void navigate(View v)
    {
        int choice = possibilities.getValue();

        if (choice==0)
        {webView.loadUrl("file:///android_asset/index.html");
        }
        else if (choice==1)
        {webView.loadUrl("file:///android_asset/index.html");
            }

        else if (choice==2)
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https:///www.coursera.org");
        }
        else if (choice==2)
        {webView.loadUrl("https:///www.google.com");
        }
    }


}