package cz.qase.android.formbuilder.validator

import cz.qase.android.formbuilder.ValidationException

class MaxLengthValidator(val errorMsg: String, private val max: Int) : Validator<String> {
    override fun validate(value: String?) {
        if (value != null && value.length > max) {
            throw ValidationException(errorMsg)
        }
    }
}
