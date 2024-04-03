package dev.ohate.wynncraft4j.model.guild;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class GuildMembers {

    private int total;
    private Map<String, GuildMember> owner;
    @SerializedName("chief")
    private Map<String, GuildMember> chiefs;
    @SerializedName("captain")
    private Map<String, GuildMember> captains;
    @SerializedName("recruiter")
    private Map<String, GuildMember> recruiters;
    @SerializedName("recruit")
    private Map<String, GuildMember> recruits;

    public int getTotal() {
        return total;
    }

    public Map<String, GuildMember> getOwner() {
        return owner;
    }

    public Map<String, GuildMember> getChiefs() {
        return chiefs;
    }

    public Map<String, GuildMember> getCaptains() {
        return captains;
    }

    public Map<String, GuildMember> getRecruiters() {
        return recruiters;
    }

    public Map<String, GuildMember> getRecruits() {
        return recruits;
    }

    @Override
    public String toString() {
        return "GuildMembers{" +
                "total=" + total +
                ", owner=" + getOwner() +
                ", chiefs=" + chiefs +
                ", captains=" + captains +
                ", recruiters=" + recruiters +
                ", recruits=" + recruits +
                '}';
    }

}
