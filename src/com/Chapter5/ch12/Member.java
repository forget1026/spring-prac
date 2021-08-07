package com.Chapter5.ch12;

import java.util.Comparator;

public class Member implements Comparator<Member> {
    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Member) {
            Member member = (Member) o;
            return this.memberId == member.getMemberId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId ;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    // 오름차순
//    @Override
//    public int compareTo(Member member) {
//        return this.memberId - member.getMemberId();
//    }

    @Override
    public int compare(Member o1, Member o2) {
        return o1.getMemberId() - o2.getMemberId();
    }
}
