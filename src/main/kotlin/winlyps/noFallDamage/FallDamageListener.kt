package winlyps.noFallDamage

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent

class FallDamageListener : Listener {

    @EventHandler
    fun onEntityDamage(event: EntityDamageEvent) {
        // Check if the damage is caused by falling
        if (event.cause == EntityDamageEvent.DamageCause.FALL) {
            // Cancel the fall damage
            event.isCancelled = true
        }
    }
}