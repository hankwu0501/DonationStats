package com.gmail.hankwu0501.hook

import com.gmail.hankwu0501.util.PercentImage.getprogress
import me.clip.placeholderapi.expansion.PlaceholderExpansion
import org.bukkit.entity.Player


object Placeholder : PlaceholderExpansion() {
    override fun getIdentifier(): String {
        return "donationstats"
    }

    override fun getAuthor(): String {
        return "hankwu0501"
    }

    override fun getVersion(): String {
        return "1.0"
    }

    override fun onPlaceholderRequest(player: Player?, params: String): String {
        val text = when (params) {
            "test" -> "測試拉"
            "fuck" -> "badbad"
            else -> {
                params
            }
        }
        return getprogress(100, 1500)
    }
}