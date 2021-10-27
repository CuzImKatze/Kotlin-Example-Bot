package Listeners

import net.dv8tion.jda.api.events.ReadyEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class ReadyListener : ListenerAdapter() {
    override fun onReady(event: ReadyEvent) {
        print("Test Bot ready!")
    }
}