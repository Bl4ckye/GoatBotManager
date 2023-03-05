package de.bl4ckye.goatbot;

import de.bl4ckye.goatbot.listeners.JoinLeaveListener;
import de.bl4ckye.goatbot.listeners.VoiceListener;
import de.bl4ckye.goatbot.secret.DoNotOpen;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.Arrays;

public class Main {

    private static JDA jda;

    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.create(DoNotOpen.TOKEN, Arrays.asList(GatewayIntent.values()));
        builder.addEventListeners(new JoinLeaveListener(), new VoiceListener());
        builder.setEnableShutdownHook(true);
        builder.setActivity(Activity.playing("Goatclient :D"));
        builder.setStatus(OnlineStatus.IDLE);
        jda = builder.build();

        /*Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            jda.getPresence().setStatus(OnlineStatus.OFFLINE);
            jda.shutdown();
        }));*/
    }

    public static JDA jda() {
        return jda;
    }
}
