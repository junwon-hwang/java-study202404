package day06.member;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Member[]arr = new Member[5];

        Member m1 = new Member("dads@ad.com","asdf","철수","남자",31);
        Member m2 = new Member("abc@def.com","1234","영희","여자",30);

        arr[0] = m1;
        arr[1] = m2;
        arr[2] = new Member("bxd@nav.com","1234","메롱","남자",18);

        Member[] members = {m1,m2};

        for (Member m : members) {
            System.out.println(m);
        }

        System.out.println("==============================");

        MemberRepository mr = new MemberRepository();
        MemberView mv = new MemberView();

        Member newMember = new Member("ddd@fff.com","4321","철수","남자",18);

        mr.addNewMember(newMember);
        mv.showMembers();


    }
}
