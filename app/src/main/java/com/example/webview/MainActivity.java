package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import org.json.JSONException;

public class MainActivity extends AppCompatActivity {

    String Link;
    Button btnsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Link = "https://staging-api.cfu.pharmalink.id/faktur-pajak/generate?type=printfaktur&nofaktur=FG000001";

        btnsub = findViewById(R.id.btnsubmit);

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PDFTools.showPDFUrl(MainActivity.this, Link);
            }
        });




//        WebView webView = (WebView) findViewById(R.id.webview);
//        webView.getSettings().setLoadsImagesAutomatically(true);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setDomStorageEnabled(true);
//
//
//        // Tiga baris di bawah ini agar laman yang dimuat dapat
//        // melakukan zoom.
//        webView.getSettings().setSupportZoom(true);
//        webView.getSettings().setBuiltInZoomControls(true);
//        webView.getSettings().setDisplayZoomControls(false);
//        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
//        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//
//        webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=" + Link);
//
//        webView.setWebViewClient(new WebViewClient());
//
//        Log.d("uwu", "ceklink "+"https://drive.google.com/viewerng/viewer?embedded=true&url=" + Link);

    }


}