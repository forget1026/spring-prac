package com.Chapter5.ch12;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        this.treeSet = new TreeSet<>(new Member());
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean iteratorRemove(int memberId) {
        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getMemberId() == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAllMember() {
        for(Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
