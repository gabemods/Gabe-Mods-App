package com.gabemods.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment

class ModsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mods, container, false)

        val modsList: ListView = view.findViewById(R.id.modsList)
        val modsArray = arrayOf(
            "Spotify", "YouTube", "Subway Surfers", "Geometry Dash",
            "Grand Battle Royale", "Block Blast", "Moto X3M"
        )

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, modsArray)
        modsList.adapter = adapter

        return view
    }
}
