package winlyps.noFallDamage

import org.bukkit.plugin.java.JavaPlugin

class NoFallDamage : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        getServer().pluginManager.registerEvents(FallDamageListener(), this)
        logger.info("NoFallDamage plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("NoFallDamage plugin has been disabled.")
    }
}