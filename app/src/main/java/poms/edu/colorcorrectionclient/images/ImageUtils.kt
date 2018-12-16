package poms.edu.colorcorrectionclient.images

import android.graphics.Bitmap
import android.view.View
import kotlin.math.roundToInt


fun getScaledBitmapForContainer(
    originalBitmap: Bitmap,
    container: View
): Bitmap {

    fun min(a: Float, b: Float) = if (a < b) a else b

    val ratio = min(
        container.height.toFloat() / originalBitmap.height.toFloat(),
        container.width.toFloat() / originalBitmap.width.toFloat()
    )

    val scaledBitmap = Bitmap.createScaledBitmap(
        originalBitmap,
        (originalBitmap.width * ratio).roundToInt(),
        (originalBitmap.height * ratio).roundToInt(),
        true
    )
    return scaledBitmap
}