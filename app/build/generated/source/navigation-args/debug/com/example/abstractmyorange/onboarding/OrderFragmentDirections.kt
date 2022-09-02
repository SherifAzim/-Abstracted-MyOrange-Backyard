package com.example.abstractmyorange.onboarding

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.abstractmyorange.R

class OrderFragmentDirections private constructor() {
    companion object {
        fun actionOrderFragmentToEditRequestFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_orderFragment_to_editRequestFragment)
    }
}
