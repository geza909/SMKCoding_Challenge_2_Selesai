package com.example.covid_19.Utilindo

import android.content.Context
import android.widget.Toast


fun tampilToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}
