package org.example.datajpa.dto;

import org.example.datajpa.entity.Member;

public record MemberDto(Long id, String username, String teamName) {
    public MemberDto(Member member) {
        this(member.getId(), member.getUsername(), null);
    }
}
