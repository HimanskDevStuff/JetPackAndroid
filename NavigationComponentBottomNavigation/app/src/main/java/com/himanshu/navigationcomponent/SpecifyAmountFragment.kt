package com.himanshu.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_specify_amount.*

class SpecifyAmountFragment : Fragment(),View.OnClickListener{
    lateinit var navController : NavController
    val navargs : SpecifyAmountFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specify_amount, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)
        send_btn.setOnClickListener(this)
        cancel_btn.setOnClickListener(this)
        Log.d("tag","amount : ${input_amount.text.toString()}")

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.send_btn -> {
                val name : String? = navargs.username
                val amount : String? = input_amount.text?.toString()
                navController.navigate(SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmationFragment(name,amount))
            }
            R.id.cancel_btn -> activity?.onBackPressed()
        }
    }

}