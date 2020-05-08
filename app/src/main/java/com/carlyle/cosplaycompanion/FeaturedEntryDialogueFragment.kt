package com.carlyle.cosplaycompanion

import androidx.appcompat.app.AlertDialog
import android.widget.EditText
import android.widget.LinearLayout
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment

class FeaturedEntryDialogueFragment : DialogFragment() {
    var positiveCallback: ((String) -> Unit)? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(context!!)
        builder.setMessage("Add to tutorials?")

        val dialogView = LayoutInflater.from(context).inflate(
            R.layout.dialogue_tutorial_entry, null
        ) as LinearLayout
        builder.setView(dialogView)

        builder.setPositiveButton("Okay") {  _, _ ->
            val entry = dialogView.findViewById<EditText>(R.id.editText)
            positiveCallback?.invoke(entry.text.toString())
        }

        builder.setNegativeButton("Cancel") {  _, _ ->
        }
        return builder.create()

    }
}

