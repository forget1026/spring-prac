package com.Chapter5.ch11;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<>();
    }

    public MemberHashSet(int capacity) {
        this.hashSet = new HashSet<>(capacity);
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean iteratorRemove(int memberId) {
        Iterator<Member> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getMemberId() == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAllMember() {
        for(Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
