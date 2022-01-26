package com.example.bottomnavbardemo

import android.content.Context
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.bottomnavbardemo.data.models.BottomBarItem
import com.example.bottomnavbardemo.databinding.SampleBlankViewBinding
import java.util.*

/**
 * TODO: document your custom view class.
 */
class BlankView(context: Context, bottomBarScreen: BottomBarItem) : FrameLayout(context) {

    private var binding: SampleBlankViewBinding = SampleBlankViewBinding.inflate(
        LayoutInflater.from(context), this, true)

    init {
        binding.viewName.text = bottomBarScreen.title + Date().time
    }

}