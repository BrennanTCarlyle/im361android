
package com.carlyle.cosplaycompanion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton

class FeaturedListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstance: Bundle?

    ): View? {
        return inflater.inflate(R.layout.fragment_featured_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
// connect to our floating action button
        val tutorialButton = view.findViewById<Button>(R.id.button2)

        // set an action to occur when the user taps on the floating action button
        tutorialButton.setOnClickListener {
            // create a new dialog/popup/alert
            val dialog = FeaturedEntryDialogueFragment()



            // actually show the dialog to the user
            dialog.show(fragmentManager!!, "add_planet")
        }

    }
}
