package mobile.computing.viewpagerexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import mobile.computing.viewpagerexercise.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabs : List<Fragment> = listOf(Tab1(), Tab2())
        binding.vpViewPager.adapter = PagerAdapter(tabs)
        try {
            TabLayoutMediator(binding.tlTabLayout, binding.vpViewPager) { tab, position ->
                when (position) {
                    0 -> tab.text = "Tab 1"
                    1 -> tab.text = "Tab 2"
                    else -> tab.text = "Tab 1"
                }
            }.attach()
        } catch (e : Exception) {
            Toast.makeText(this, "Could not bind tab view", Toast.LENGTH_SHORT).show()
        }
    }
}