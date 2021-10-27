package Listeners

import net.dv8tion.jda.api.entities.Message
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class MessageListener : ListenerAdapter() {
    override fun onMessageReceived(event: MessageReceivedEvent) {
        val msg: Message = event.message
        if(msg.contentRaw.equals("!ping")) {
            msg.channel.sendMessage("Pong!")
        }
    }
}