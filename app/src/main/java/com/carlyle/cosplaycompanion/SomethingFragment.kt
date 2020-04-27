
package com.carlyle.cosplaycompanion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SomethingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstance: Bundle?

    ): View? {
        return inflater.inflate(R.layout.fragment_featured_list, container, false)
    }
}