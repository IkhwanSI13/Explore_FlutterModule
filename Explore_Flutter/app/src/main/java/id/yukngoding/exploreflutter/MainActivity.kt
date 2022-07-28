package id.yukngoding.exploreflutter

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClickListener()
    }

    fun onClickListener() {
        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            startActivity(
                FlutterActivity.createDefaultIntent(this)
            )
            //  startActivity(
            //    FlutterActivity
            //      .withNewEngine()
            //      .initialRoute("/my_route")
            //      .build(this)
            //  )
        }
    }

}