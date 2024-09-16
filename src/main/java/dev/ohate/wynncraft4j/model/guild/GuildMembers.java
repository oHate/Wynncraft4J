package dev.ohate.wynncraft4j.model.guild;

import java.util.Map;
import java.util.UUID;

public class GuildMembers {

    private int total;
    private Map<UUID, GuildMember> owner;
    private Map<UUID, GuildMember> chief;
    private Map<UUID, GuildMember> captain;
    private Map<UUID, GuildMember> recruiter;
    private Map<UUID, GuildMember> recruit;

    /**
     * Returns the total number of members in the guild.
     *
     * @return the total number of guild members
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Returns a map of guild members who are owners.
     * The map's key is the member's UUID and the value is the {@link GuildMember} object.
     *
     * @return a map of guild owners.
     */
    public GuildMember getOwner() {
        return this.owner.values().iterator().next();
    }

    /**
     * Returns a map of guild members who are chiefs.
     * The map's key is the member's UUID and the value is the {@link GuildMember} object.
     *
     * @return a map of guild chiefs.
     */
    public Map<UUID, GuildMember> getChiefs() {
        return this.chief;
    }

    /**
     * Returns a map of guild members who are captains.
     * The map's key is the member's UUID and the value is the {@link GuildMember} object.
     *
     * @return a map of guild captains.
     */
    public Map<UUID, GuildMember> getCaptains() {
        return this.captain;
    }

    /**
     * Returns a map of guild members who are recruiters.
     * The map's key is the member's UUID and the value is the {@link GuildMember} object.
     *
     * @return a map of guild recruiters.
     */
    public Map<UUID, GuildMember> getRecruiters() {
        return this.recruiter;
    }

    /**
     * Returns a map of guild members who are recruits.
     * The map's key is the member's UUID and the value is the {@link GuildMember} object.
     *
     * @return a map of guild recruits.
     */
    public Map<UUID, GuildMember> getRecruits() {
        return this.recruit;
    }

    /**
     * Returns a string representation of the {@code GuildMembers} object.
     * This includes the total number of members and the maps of members organized by role.
     *
     * @return a {@code String} containing details of the guild members.
     */
    @Override
    public String toString() {
        return "GuildMembers{" +
                "total=" + this.total +
                ", owner=" + this.owner +
                ", chief=" + this.chief +
                ", captain=" + this.captain +
                ", recruiter=" + this.recruiter +
                ", recruit=" + this.recruit +
                '}';
    }

}
