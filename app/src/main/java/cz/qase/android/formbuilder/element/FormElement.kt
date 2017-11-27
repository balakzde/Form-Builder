package cz.qase.android.formbuilder.element

import android.content.Context
import android.view.View
import cz.qase.android.formbuilder.FormBuilder
import cz.qase.android.formbuilder.ValidationException

interface FormElement<T> {

    fun createView(context: Context, styleBundle: FormBuilder.StyleBundle): View

    @Throws(ValidationException::class)
    fun validate()

}