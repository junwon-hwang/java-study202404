package day06.member;

// 역할: 회원배열을 관리하는 역할 - 회원 데이터 저장소
public class MemberRepository {

    // 필드
    static Member[] members;

    // 생성자
    MemberRepository(){
        this.members = new Member[3];
        members[0] = new Member("zxv@def.com","1234","콩순이","여자",50);
        members[1] = new Member("qwe@def.com","5678","팥돌이","남자",40);
        members[2] = new Member("asd@def.com","9012","팔죽이","여자",30);
    }
    // 메서드

    // 회원정보생성
    void addNewMember(Member newMember){

        // 배열에 데이터를 추가하는 로직
        Member[] temp = new Member[members.length+1];
        for (int i = 0; i <members.length ; i++) {
            temp[i] = members[i];
        }
        temp[temp.length-1] = newMember;
        members = temp;
    }
}
