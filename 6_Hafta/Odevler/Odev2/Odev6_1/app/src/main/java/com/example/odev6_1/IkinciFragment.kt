package com.example.odev6_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev6_1.databinding.FragmentIkinciBinding


class IkinciFragment : Fragment() {
    private lateinit var tasarim: FragmentIkinciBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentIkinciBinding.inflate(inflater, container, false)
        tasarim.buttonSonuc.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sonucEkraniGecis)
        }
        return tasarim.root
    }



}