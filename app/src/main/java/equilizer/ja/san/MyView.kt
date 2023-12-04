package equilizer.ja.san

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class MyView(context: Context,attributeSet: AttributeSet):View(context,attributeSet){



    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val cir = Paint()
        cir.color = Color.RED
        cir.style = Paint.Style.STROKE
        cir.strokeWidth = 10f

        canvas?.drawCircle(100f,200f,100f,cir)


    }


}