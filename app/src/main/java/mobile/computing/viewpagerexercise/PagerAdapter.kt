package mobile.computing.viewpagerexercise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView

class PagerAdapter(private val items: List<Fragment>) : RecyclerView.Adapter<PagerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val fragmentId = when (parent.childCount + 1) {
            1 -> R.layout.fragment_tab1
            2 -> R.layout.fragment_tab2
            else -> R.layout.fragment_tab1
        }
        val view = LayoutInflater.from(parent.context).inflate(fragmentId, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView
    )


}