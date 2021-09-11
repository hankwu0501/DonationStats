package com.gmail.hankwu0501

import com.gmail.hankwu0501.hook.Placeholder
import org.bukkit.plugin.java.JavaPlugin

class DonationStats :JavaPlugin(){
    override fun onEnable() {
        if(Placeholder.register()){
            this.logger.info("Placeholder 註冊完畢")
        }
    }
}