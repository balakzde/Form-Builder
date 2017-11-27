package cz.qase.android.formbuilder

import android.content.Context
import android.view.ViewGroup
import cz.qase.android.formbuilder.element.FormElement

class Form(val context: Context,
           val viewGroup: ViewGroup,
           val elements: MutableList<FormElement<*>>,
           val styleBundle: FormBuilder.StyleBundle) {

    @Throws(ValidationException::class)
    fun validate() {
        for (formElement in elements) {
            formElement.validate()
        }
    }

    fun draw(){
        for (element in elements) {
            viewGroup.addView(element.createView(context, styleBundle))
        }
    }

    fun sendForm(callback: Callback) {
        try {
            validate()
        } catch (e: ValidationException) {
            callback.errorCallback(e.message)
            return
        }
        callback.successCallback()
    }

    interface Callback {
        fun successCallback()
        fun errorCallback(message: String?)

    }
}