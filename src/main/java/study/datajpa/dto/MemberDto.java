package study.datajpa.dto;

public class MemberDto {

    private Long id;
    private String username;
    private String testName;

    public MemberDto(Long id, String username, String testName) {
        this.id = id;
        this.username = username;
        this.testName = testName;
    }
}
