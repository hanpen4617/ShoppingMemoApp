package com.example.shoppingmemoapp.ui.menu

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.ListView

import com.example.shoppingmemoapp.MainActivity
import com.example.shoppingmemoapp.R

class MenuFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        val mainActivity: MainActivity = activity as MainActivity

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }
}