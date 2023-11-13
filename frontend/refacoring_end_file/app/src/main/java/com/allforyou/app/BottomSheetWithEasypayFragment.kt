package com.allforyou.app

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.allforyou.app.databinding.FragmentBottomSheetWithEasypayBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetWithEasypayFragment : BottomSheetDialogFragment() {
    private var priceUpdateListener:OnPriceUpdateListener?=null
    private lateinit var binding:FragmentBottomSheetWithEasypayBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetWithEasypayBinding.inflate(inflater, container, false)

        binding.one.setOnClickListener{onClickNumber(binding.one)}
        binding.two.setOnClickListener{onClickNumber(binding.two)}
        binding.three.setOnClickListener{onClickNumber(binding.three)}
        binding.four.setOnClickListener{onClickNumber(binding.four)}
        binding.five.setOnClickListener{onClickNumber(binding.five)}
        binding.six.setOnClickListener{onClickNumber(binding.six)}
        binding.seven.setOnClickListener{onClickNumber(binding.seven)}
        binding.eight.setOnClickListener{onClickNumber(binding.eight)}
        binding.nine.setOnClickListener{onClickNumber(binding.nine)}
        binding.zero.setOnClickListener{onClickNumber(binding.zero)}
        binding.del.setOnClickListener{del()}
        binding.finish.setOnClickListener{finished()}


        return binding.root
    }

    fun onClickNumber(view:View?) {
        val inp=(view as TextView).text.toString()
        Log.d("함수 실행",inp+" onClickNumber")
        priceUpdateListener?.num(inp)
    }

    fun del() {
        priceUpdateListener?.del()
    }

    fun finished() {
        priceUpdateListener?.finish()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    fun setOnPriceUpdateListener(listener: OnPriceUpdateListener){
        priceUpdateListener=listener
    }

    interface  OnPriceUpdateListener{
        fun num(inp:String)
        fun del()

        fun finish()
    }



    companion object {
       const val TAG="BasicBottomModalSheet"
    }
}