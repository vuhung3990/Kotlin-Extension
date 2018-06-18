package mylab.nht.kotlin_extension.extension

import android.view.View


fun View.visible() {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
}


fun View.inVisible() {
    if (visibility != View.INVISIBLE) {
        visibility = View.INVISIBLE
    }
}


fun View.gone() {
    if (visibility != View.GONE) {
        visibility = View.GONE
    }
}