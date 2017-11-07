// release 0.1
package it.seahawk.cookies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Called when the cookie should be eaten.
     */
    fun eatCookie(view: View) {
        val imageView = findViewById<ImageView>(R.id.android_cookie_image_view) as ImageView
        imageView.setImageResource(R.drawable.after_cookie)

        val textView = findViewById<ImageView>(R.id.status_text_view) as TextView
        textView.text = "I'm so full"

    }
}
