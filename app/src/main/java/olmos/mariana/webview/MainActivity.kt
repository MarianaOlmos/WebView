package olmos.mariana.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //PRIVATE

    private val BASE_URL = "https://www.google.com/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //WEBVIEW

        webView.webChromeClient = object : WebChromeClient() {

        }
        webView.webViewClient = object : WebViewClient() {

        }
        val setting: WebSettings = webView.settings
        setting.javaScriptEnabled = true
        webView.loadUrl(BASE_URL)


    }
}
