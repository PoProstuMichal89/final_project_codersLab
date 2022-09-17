package pl.private_programing_barman.dto;

public class OpinionToSaveDto {

    private String nickname;
    private String content;
    private int rate;

    public OpinionToSaveDto(String nickname, String content, int rate) {
        this.nickname = nickname;
        this.content = content;
        this.rate = rate;
    }




    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

}
