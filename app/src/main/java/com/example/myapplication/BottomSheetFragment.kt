package com.example.myapplication

import android.app.Dialog
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment: BottomSheetDialogFragment() {

    companion object {
        const val BOTTOM_PURCHASE_TAG = "BOTTOM_PURCHASE_TAG"

        fun createInstance() = BottomSheetFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_bottom_sheet, container)

//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        val bottomSheetDialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
//
//        bottomSheetDialog.setOnShowListener {
//            val bottomSheet = bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
//            setDialogOptions(bottomSheet) { bottomSheetView ->
//                bottomSheetView.layoutParams?.height = ViewGroup.LayoutParams.MATCH_PARENT
//                bottomSheetView.minimumHeight = Resources.getSystem().displayMetrics.heightPixels
//            }
//        }
//        return bottomSheetDialog
//    }
//
//    private fun setDialogOptions(
//        bottomSheet: View?,
//        viewOptionsInstaller: ((View) -> Unit)? = null
//    ) {
//        bottomSheet?.let { bottomSheetView ->
//            viewOptionsInstaller?.invoke(bottomSheetView)
//            BottomSheetBehavior.from(bottomSheetView).apply {
//                skipCollapsed = true
//                setState(BottomSheetBehavior.STATE_EXPANDED)
//            }
//        }
//    }
}