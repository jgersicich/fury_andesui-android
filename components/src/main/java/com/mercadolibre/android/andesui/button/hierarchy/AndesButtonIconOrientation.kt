package com.mercadolibre.android.andesui.button.hierarchy

/**
 * Utility class that models the possible positions an icon can take: Left or Right.
 *
 */
enum class AndesButtonIconOrientation {
    LEFT,
    RIGHT;

    companion object {
        fun fromString(value: String): AndesButtonIconOrientation = valueOf(value.toUpperCase())
    }
}
