package me.yifeiyuan.hf.constraintlayout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val container: ConstraintLayout = findViewById(R.id.container)
        val childCount: Int = container.getChildCount()
        for (i in 0 until childCount) {
            container.getChildAt(i).setOnClickListener(this)
        }
    }

    override fun onClick(v: View) {
        var cls: Class<*>? = null
        when (v.id) {
            R.id.relative -> cls = RelativeActivity::class.java
            R.id.margins -> cls = PositionActivity::class.java
            R.id.centering -> {
            }
            R.id.circular -> {
            }
            R.id.visibility -> {
            }
            R.id.chains -> {
            }
            R.id.virtual -> {
            }
            R.id.optimizer -> {
            }
        }
        letsgo(cls)
    }

    private fun letsgo(cls: Class<*>?) {
        val intent = Intent(this, cls)
        startActivity(intent)
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
