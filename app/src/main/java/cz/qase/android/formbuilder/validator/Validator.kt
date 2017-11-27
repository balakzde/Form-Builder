package cz.qase.android.formbuilder.validator

interface Validator<in T> {
     fun validate(value: T?)
}
