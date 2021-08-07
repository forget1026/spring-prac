package com.Chapter5.ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        this.arrayList = new ArrayList<>();
    }

    public MemberArrayList(int capacity) {
        this.arrayList = new ArrayList<>(capacity);
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMeber(int memberId) {
        for(int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public boolean iteratorRemove(int memberId) {
        Iterator<Member> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getMemberId() == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showAllMember() {
        for(Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
