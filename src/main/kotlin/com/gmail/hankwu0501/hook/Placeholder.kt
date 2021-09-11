package com.gmail.hankwu0501.hook

import me.clip.placeholderapi.expansion.PlaceholderExpansion
import org.bukkit.entity.Player




object Placeholder :PlaceholderExpansion(){
    override fun getIdentifier(): String {
        return "donationstats"
    }

    override fun getAuthor(): String {
        return "hankwu0501"
    }

    override fun getVersion(): String {
        return "1.0"
    }

    override fun onPlaceholderRequest(player: Player?, params: String): String? {
        var text: String? = null
        if (params.equals("test", ignoreCase = true)){
            text = "test1111"
        }
        return text
    }
}