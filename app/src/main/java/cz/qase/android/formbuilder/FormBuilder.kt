package cz.qase.android.formbuilder

import android.app.Fragment
import android.content.Context
import android.view.View
import android.view.ViewGroup
import cz.qase.android.formbuilder.element.FormElement

class FormBuilder() {

    private val elements: MutableList<FormElement<*>> = ArrayList()

    fun addElement(formElement: FormElement<*>) {
        elements.add(formElement)
    }

    fun buildForm(context: Context,
                  containerView: ViewGroup,
                  styleBundle: FormBuilder.StyleBundle = StyleBundle()): Form {
        return Form(context, containerView, elements, styleBundle)
    }


    class StyleBundle(val primaryTextColor: Int = R.color.colorPrimary,
                      val primaryBackground: Int = R.color.colorBackgroundPrimary,
                      val secondaryTextColor: Int = R.color.colorDefaultText,
                      val secondaryBackgroundColor: Int = R.color.colorBackground)
}