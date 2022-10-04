package pl.private_programing_barman.dto;

public class OpinionToSaveDto {

    private String nickname;
    private String content;
    private int rate;

    private DrinkDto drink;

    public OpinionToSaveDto(String nickname, String content, int rate, DrinkDto drink) {
        this.nickname = nickname;
        this.content = content;
        this.rate = rate;
        this.drink = drink;
    }

    public OpinionToSaveDto() {
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
