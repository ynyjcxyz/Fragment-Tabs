package com.example.android.californiathebest;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;


public class DetailPage extends AppCompatActivity {
    private Banner mBanner;
    String webViewUrl = new WebViewUrl().getWebViewUrl(0, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page);
        initView();
        initData();

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl(webViewUrl);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    private void initView() {
        mBanner = findViewById(R.id.mBanner);
    }

    private void initData() {
        mBanner.setAdapter(new BannerImageAdapter<DateBean>(DateBean.getDateOfGoldenGateBridge()) {
            @Override
            public void onBindView(BannerImageHolder holder, DateBean data, int position, int size) {
                Glide.with(holder.imageView)
                        .load(data.getImageUrl())
                        .into(holder.imageView);
            }
        }).addBannerLifecycleObserver(this)                         //添加生命周期观察者
                .setIntercept(false)                                //是否拦截事件
                .setIndicator(new CircleIndicator(this));     //圆形指示器;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
