package de.bl4ckye.goatbot.listeners;

import jdk.jfr.Category;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.WidgetUtil;

//import static java.util.regex.CharPredicates.category;

public class VoiceListener extends ListenerAdapter {

    /*@Override
    public void onGuildVoiceUpdate(GuildVoiceUpdateEvent event) {
        if(event.getNewValue() == null)
            leave(event);
        else if(event.getOldValue() == null)
            join(event);
        else{
            leave(event);
            join(event);
        }
    }
    private void leave(GuildVoiceUpdateEvent event){
        System.out.println("Voice Left");
    }
    private void join(GuildVoiceUpdateEvent event) {
        assert event.getNewValue() != null;
         if(event.getNewValue().getIdLong() == 1081663441674190888L){
             Guild guild = event.getGuild();
             Member member = event.getMember();
             Category category = (Category) event.getNewValue().getParentCategory();
             category.createVoiceChannel(" " + member.getUser().getName());
         }
    }
    */


}
