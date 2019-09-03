package org.ven.mockitilearning.model.api;

import java.util.Objects;

public class Pojo {
    public int getMember() {
        return member;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "member=" + member +
                ", anothermember='" + anothermember + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo pojo = (Pojo) o;
        return member == pojo.member &&
                Objects.equals(anothermember, pojo.anothermember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member, anothermember);
    }

    public void setMember(int member) {
        this.member = member;
    }

    public String getAnothermember() {
        return anothermember;
    }

    public void setAnothermember(String anothermember) {
        this.anothermember = anothermember;
    }

    int member;
    String anothermember;

    public Pojo(int i, String j){
        this.member = i;
        this.anothermember = j;
    }

}
