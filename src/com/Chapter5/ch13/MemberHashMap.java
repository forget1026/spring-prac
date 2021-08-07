package com.Chapter5.ch13;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println("No Element");
        return false;
    }

    public void showAllMemeber(){
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while(iterator.hasNext()) {
            int key = iterator.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }

}
