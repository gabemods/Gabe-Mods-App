package com.gabemods.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment

class GamesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_games, container, false)

        val gamesList: ListView = view.findViewById(R.id.gamesList)
        val gamesArray = arrayOf(
            "Subway Surfers", "Geometry Dash", "Moto X3M"
        )

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, gamesArray)
        gamesList.adapter = adapter

        return view
    }
}
