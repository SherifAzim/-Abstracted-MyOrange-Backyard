package com.example.abstractmyorange.main

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.abstractmyorange.R

class MainFragmentDirections private constructor() {
    companion object {
        fun actionMainFragmentToOrderFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_mainFragment_to_orderFragment)

        fun actionMainFragmentToEditRequestFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_mainFragment_to_editRequestFragment)
    }
}
