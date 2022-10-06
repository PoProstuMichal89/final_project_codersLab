package pl.private_programing_barman.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class OpinionToSaveDto {

    @NotBlank
    @Size(min = 2, max = 50)
    private String nickname;

    @Size(max=500)
    @NotBlank
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
