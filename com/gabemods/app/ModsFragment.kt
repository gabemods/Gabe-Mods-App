package com.gabemods.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import android.widget.Button
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment

class ModsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mods, container, false)

        // Mods List
        val modsList: ListView = view.findViewById(R.id.modsList)
        val modsArray = arrayOf(
            "Spotify", "YouTube", "Subway Surfers", "Geometry Dash",
            "Grand Battle Royale", "Block Blast", "Moto X3M"
        )
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, modsArray)
        modsList.adapter = adapter

        // Community Mods Button Link
        val communityModsButton: TextView = view.findViewById(R.id.communityModsButton)
        communityModsButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/GabeMods_CommunityModsAPKs"))
            startActivity(intent)
        }

        // AltStore Button Link
        val altstoreButton: Button = view.findViewById(R.id.altstoreButton)
        altstoreButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://altstore.io"))
            startActivity(intent)
        }

        // SideStore Button Link
        val sidestoreButton: Button = view.findViewById(R.id.sidestoreButton)
        sidestoreButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://SideStore.io"))
            startActivity(intent)
        }

        return view
    }
}
