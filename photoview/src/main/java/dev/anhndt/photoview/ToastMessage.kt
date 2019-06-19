package dev.anhndt.photoview

import android.content.Context
import android.widget.Toast

object ToastMessage {
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}