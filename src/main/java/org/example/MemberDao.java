package org.example;

import java.util.List;
import java.util.Optional;

public interface MemberDao {
    Optional<Member> getById(int id);
    List<Member> getAll();
    void update(Member member);
    void create(Member member);
    void delete(Member member);
    List<Member> getActiveMembers();
    List<Member> getInactiveMembers();
}
