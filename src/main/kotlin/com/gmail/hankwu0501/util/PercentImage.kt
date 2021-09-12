package com.gmail.hankwu0501.util

import kotlin.math.roundToInt

object PercentImage {
    fun getprogress(now: Int, total: Int): String {
        if(now>total){
            return "數值錯誤"
        }
        val calculate = (now.toDouble() / total.toDouble())
        val offset = (16 * calculate).roundToInt() + 2
        return StringBuilder("§f■■■■■■■■■■■■■■■■").insert(offset, "§7").toString()
    }
}