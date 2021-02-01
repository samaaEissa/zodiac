package com.example.zodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView image;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent caller=getIntent();
        String Age=caller.getStringExtra("Age");
        String zodiac=caller.getStringExtra("zodiac");
        TextView textView_age=(TextView)findViewById(R.id.text_age);
        textView_age.setText("your age is :" +Age);
        TextView textView_zodiac=(TextView)findViewById(R.id.text_zodiac);
        textView_zodiac.setText("your  zodiac is :" +zodiac);
         image=(ImageView)findViewById(R.id.zodiac_image);
        webView=(WebView)findViewById(R.id.webView);
        set_image_resource(zodiac);
        set_viewURL(zodiac);




    }
    public  void set_image_resource( String zodiac){
        if (zodiac.equals("Aries"))
           image.setImageResource(R.drawable.aries);
        else if (zodiac.equals("Taurus"))
        image.setImageResource(R.drawable.taurus);
        else if (zodiac.equals("Gemini"))
            image.setImageResource(R.drawable.gemini);
        else if (zodiac.equals("Cancer"))
            image.setImageResource(R.drawable.cancer);
        else if (zodiac.equals("Leo"))
            image.setImageResource(R.drawable.leo);
        else if (zodiac.equals("Virgo"))
            image.setImageResource(R.drawable.virgo);
        else if (zodiac.equals("Libra"))
            image.setImageResource(R.drawable.libra);
        else if (zodiac.equals("Scorpio"))
            image.setImageResource(R.drawable.scorpio);
        else if (zodiac.equals("Sagittarius"))
            image.setImageResource(R.drawable.sagittarius);
        else if (zodiac.equals("Capricorn"))
            image.setImageResource(R.drawable.capricorn);
        else if (zodiac.equals("Aquarius"))
            image.setImageResource(R.drawable.aquarius);
        else if (zodiac.equals("Pisces"))
            image.setImageResource(R.drawable.pisces);

    }
    public  void set_viewURL( String zodiac){
        if ("Aries".equals(zodiac))
           { webView.setWebViewClient(new WebViewClient());
               webView.loadUrl("https://en.wikipedia.org/wiki/Aries_(astrology)");}
        else if ("Taurus".equals(zodiac))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Taurus_(astrology)");}
        else if ("Gemini".equals(zodiac))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Gemini_(astrology)");}
        else if (zodiac.equals("Cancer"))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Cancer_(astrology)");}
        else if (zodiac.equals("Leo"))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Leo_(astrology)");}
        else if (zodiac.equals("Virgo"))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Virgo_(astrology)");}
        else if (zodiac.equals("Libra"))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Libra_(astrology)");}
        else if (zodiac.equals("Scorpio"))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Scorpio_(astrology)#:~:text=Scorpio%20(%E2%99%8F%EF%B8%8E)%20is%20the,October%2023%20to%20November%2022.");}
        else if (zodiac.equals("Sagittarius"))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Sagittarius_(astrology)");}
        else if (zodiac.equals("Capricorn"))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Capricorn_(astrology)");}
        else if (zodiac.equals("Aquarius"))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Aquarius_(astrology)");}
        else if (zodiac.equals("Pisces"))
        { webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://en.wikipedia.org/wiki/Pisces_(astrology)#:~:text=Pisces%20(%E2%99%93%EF%B8%8E)%20(%2F,February%2019%20and%20March%2020.");}

    }
}