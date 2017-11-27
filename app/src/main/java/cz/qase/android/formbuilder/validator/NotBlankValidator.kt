package cz.qase.android.formbuilder.validator

import cz.qase.android.formbuilder.ValidationException

class NotBlankValidator(val errorMsg: String) : Validator<String> {
    override fun validate(value: String?) {
        if (value.isNullOrBlank()) {
            throw ValidationException(errorMsg)
        }
    }
}
