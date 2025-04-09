package com.gabemods.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment

class LearnFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_learn, container, false)

        val topicsList: ListView = view.findViewById(R.id.topicsList)
        val topicsArray = arrayOf(
            "Introduction to Python", "HTML & CSS Basics", 
            "JavaScript Essentials", "How to Build a Website"
        )

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, topicsArray)
        topicsList.adapter = adapter

        return view
    }
}
