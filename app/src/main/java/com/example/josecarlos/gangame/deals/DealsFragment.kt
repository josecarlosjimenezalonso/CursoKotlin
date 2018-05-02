package com.example.josecarlos.gangame.deals

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.josecarlos.gangame.R
import kotlinx.android.synthetic.main.activity_main.view.*

/**
 * Created by josecarlos on 02/05/2018.
 */

class DealsFragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_deals, container, false);
        return view
    }
}

