package cz.qase.android.formbuilder.element

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import cz.qase.android.formbuilder.FormBuilder
import cz.qase.android.formbuilder.R
import kotlinx.android.synthetic.main.component_head_text_view.view.*

class HeadTextViewElement(val title: String, val value: String, val component: Int = R.layout.component_head_text_view) : FormElement<String> {

    override fun validate() {
    }

    override fun createView(context: Context, styleBundle: FormBuilder.StyleBundle): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(component, null)
        view.value.text = value
        view.title.setTextColor(context.resources.getColor(styleBundle.primaryTextColor))
        view.title.setBackgroundColor(context.resources.getColor(styleBundle.primaryBackground))
        view.value.setTextColor(context.resources.getColor(styleBundle.secondaryTextColor))
        view.value.setBackgroundColor(context.resources.getColor(styleBundle.secondaryBackgroundColor))
        view.title.text = title
        return view
    }
}
