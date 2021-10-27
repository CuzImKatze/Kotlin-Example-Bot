import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.OnlineStatus
import net.dv8tion.jda.api.entities.Activity

fun main() {
    val client: JDABuilder = JDABuilder.createDefault("Token here")
    client.setAutoReconnect(true)
    client.setActivity(Activity.watching("Test 123"))
    client.setStatus(OnlineStatus.ONLINE)
    LoadListeners(client)
    client.build()
}

fun LoadListeners(client: JDABuilder) {

}