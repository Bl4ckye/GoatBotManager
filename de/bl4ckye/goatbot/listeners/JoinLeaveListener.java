package de.bl4ckye.goatbot.listeners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TeamMember;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.OffsetDateTime;

public class JoinLeaveListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        super.onGuildMemberJoin(event);
        Member member = event.getMember();
        Guild guild = event.getGuild();
        TextChannel textChannel = guild.getTextChannelById("1080357646982467666");
        //textChannel.sendMessage(member.getAsMention() + " hat den Server betreten").queue();
        EmbedBuilder builder = new EmbedBuilder();
            builder.setDescription(member.getAsMention() + " hat den Server betreten. Wir sind nun " + guild.getMemberCount() + " Mitglieder!");
            builder.setTimestamp(OffsetDateTime.now());
            builder.setColor(54544);
        if(member.getUser().getAvatarUrl() != null)
            builder.setImage(member.getUser().getAvatarUrl());
        else
            builder.setImage(member.getUser().getDefaultAvatarUrl());

        textChannel.sendMessageEmbeds(builder.build()).queue();
    }

    @Override
    public void onGuildMemberRemove(GuildMemberRemoveEvent event) {
        User user = event.getUser();
        super.onGuildMemberRemove(event);
        Member member = event.getMember();
        Guild guild = event.getGuild();
        TextChannel textChannel = guild.getTextChannelById("1080357646982467666");
        textChannel.sendMessage(user.getName() + "#" + user.getDiscriminator() +  " hat den Server verlassen.").queue();
    }
}
