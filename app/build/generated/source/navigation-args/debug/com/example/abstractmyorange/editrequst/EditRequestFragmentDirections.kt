package com.example.abstractmyorange.editrequst

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.abstractmyorange.R

class EditRequestFragmentDirections private constructor() {
    companion object {
        fun actionEditRequestFragmentToTariffCostFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_editRequestFragment_to_tariffCostFragment)
    }
}
