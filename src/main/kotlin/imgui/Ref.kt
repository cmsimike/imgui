package imgui

object Ref {

//    var i0 = 0
//    var i1 = 0
//    var i2 = 0
//    var i3 = 0
//    var i4 = 0
//    var i5 = 0
//    var i6 = 0
//    var i7 = 0
//    var i8 = 0
//    var i9 = 0
//
//    var f0 = 0f
//    var f1 = 0f
//    var f2 = 0f
//    var f3 = 0f
//    var f4 = 0f
//    var f5 = 0f
//    var f6 = 0f
//    var f7 = 0f
//    var f8 = 0f
//    var f9 = 0f
//
//    var b0 = false
//    var b1 = false
//    var b2 = false
//    var b3 = false
//    var b4 = false
//    var b5 = false
//    var b6 = false
//    var b7 = false
//    var b8 = false
//    var b9 = false

    var iPtr = 0
    var fPtr = 0
    var bPtr = 0
    var cPtr = 0

    val size = 1024

    val ints = IntArray(size)
    val floats = FloatArray(size)
    val bools = BooleanArray(size)
    val chars = CharArray(size)

    var int
        get() = ints[iPtr]
        set(value) = ints.set(iPtr, value)
    var float
        get() = floats[fPtr]
        set(value) = floats.set(fPtr, value)
    var bool
        get() = bools[bPtr]
        set(value) = bools.set(bPtr, value)
    var char
        get() = chars[cPtr]
        set(value) = chars.set(cPtr, value)
}

//inline fun <R>withInt(block: (KMutableProperty0<Int>) -> R): R {
//    Ref.iPtr++
//    return block(Ref::int).also { Ref.iPtr-- }
//}
//
//inline fun <R>withFloat(block: (KMutableProperty0<Float>) -> R): R {
//    Ref.fPtr++
//    return block(Ref::float).also { Ref.fPtr-- }
//}
//
//inline fun <R>withBool(block: (KMutableProperty0<Boolean>) -> R): R {
//    Ref.bPtr++
//    return block(Ref::bool).also { Ref.bPtr-- }
//}