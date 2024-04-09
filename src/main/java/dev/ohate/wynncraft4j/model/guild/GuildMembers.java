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

    public int getTotal() {
        return total;
    }

    public Map<UUID, GuildMember> getOwner() {
        return owner;
    }

    public Map<UUID, GuildMember> getChiefs() {
        return chief;
    }

    public Map<UUID, GuildMember> getCaptains() {
        return captain;
    }

    public Map<UUID, GuildMember> getRecruiters() {
        return recruiter;
    }

    public Map<UUID, GuildMember> getRecruits() {
        return recruit;
    }

    @Override
    public String toString() {
        return "GuildMembers{" +
                "total=" + total +
                ", owner=" + owner +
                ", chief=" + chief +
                ", captain=" + captain +
                ", recruiter=" + recruiter +
                ", recruit=" + recruit +
                '}';
    }

}
