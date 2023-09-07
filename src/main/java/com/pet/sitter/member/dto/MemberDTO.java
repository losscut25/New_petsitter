package com.pet.sitter.member.dto;

import com.pet.sitter.common.entity.Member;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {

    private Long id;
    private String memberId;
    private String pw;
    private String name;
    private String phone;
    private String eMail;
    private String birth;
    private String address;
    private String detailaddress;
    private String zipcode;
    private String nickName;
    private String isshow;

    @Builder
    public MemberDTO(Member member) {
        this.id = member.getId();
        this.memberId = member.getMemberId();
        this.pw = member.getPw();
        this.name = member.getName();
        this.phone = member.getPhone();
        this.eMail = member.getEMail();
        this.birth = member.getBirth();
        this.address = member.getAddress();
        this.detailaddress = member.getDetailaddress();
        this.zipcode = member.getZipcode();
        this.nickName = member.getNickname();
        this.isshow = member.getIsshow();
    }
    //예시
    //MemberDTO memberDTO = new MemeberDTO(member);
}
