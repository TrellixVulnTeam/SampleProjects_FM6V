package com.ioc.catchgame.gameEngine.catchable.fruit

import android.content.Context
import android.graphics.Bitmap
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.drawable.toBitmap
import com.ioc.catchgame.R
import com.ioc.catchgame.gameEngine.catchable.GoodStuff

class Pineapple (override val context: Context) : GoodStuff(context) {
    override val points: Int = 19

    override fun getBitmap(): Bitmap? {
        return AppCompatResources.getDrawable(this.context, R.drawable.ic_fruit_pineapple)
            ?.toBitmap(width,height)
    }
}