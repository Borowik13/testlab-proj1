package custom_database;

import java.util.Set;

public class Member {
    private int id;
    private String member_name;
    private String content;

    public Member() {
    }

    public Member(String member_name, String content) {
        this.member_name = member_name;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemberName() {
        return member_name;
    }

    public void setMemberName(String member_name) {
        this.member_name = member_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
