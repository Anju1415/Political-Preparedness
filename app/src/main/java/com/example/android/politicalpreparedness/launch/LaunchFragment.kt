package com.example.android.politicalpreparedness.launch


import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.android.politicalpreparedness.DataBinderMapperImpl
import com.example.android.politicalpreparedness.R
import com.example.android.politicalpreparedness.databinding.FragmentLaunchBinding
import com.example.android.politicalpreparedness.election.adapter.ElectionListAdapter
import com.example.android.politicalpreparedness.election.adapter.ElectionListener

class LaunchFragment : Fragment() {

private  lateinit var binding: FragmentLaunchBinding
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

             binding = DataBindingUtil.inflate(inflater, R.layout.fragment_launch, container, false)

            binding.lifecycleOwner = this
            binding.representativesButton.setOnClickListener { navToRepresentatives() }
            binding.upcomingElectionsButton.setOnClickListener { navToElections()

                }
            return binding.root
        }


    private fun navToElections() {
        this.findNavController().navigate(LaunchFragmentDirections.actionLaunchFragmentToElectionsFragment())
    }

    private fun navToRepresentatives() {
        this.findNavController().navigate(LaunchFragmentDirections.actionLaunchFragmentToRepresentativeFragment())
    }



}
