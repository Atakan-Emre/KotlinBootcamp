package com.example.odev6_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev6_1.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)
        tasarim.buttonBasla.setOnClickListener{
            val gecis = AnaSayfaFragmentDirections.ikinciEkranaGecis("Fatmanur","Çiçek",32)
            Navigation.findNavController(it).navigate(R.id.ikinciEkranaGecis)
        }
        return tasarim.root
    }


}
