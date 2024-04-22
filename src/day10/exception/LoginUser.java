package day10.exception;

public class LoginUser {
    private String account; // 가입시 계정명
    private String password; // 가입시 패스워드

    public LoginUser(String account, String password){
        this.account = account;
        this.password = password;
    }

    public enum LoginStatus {
        SUCCESS, ID_FAIL, PW_FAIL
    }

    // 로그인 검증
    public LoginStatus loginValidate (String inputAccount , String inputPassword)
        throws Exception
    {
        // 아이디가 일치하는가?
        // 자바가 봤을땐 에러가 아니지만 개발자에겐 에러
        if(!inputAccount.equals(account)){
            throw new Exception("계정이 일치하지 않습니다.");
        }
        // 비밀번호가 일치하는가?
        if(!inputPassword.equals(password)){
            throw new Exception("비밀번호가 일치하지 않습니다.");
        }
        throw new Exception("로그인이 성공했습니다!");
    }
}
