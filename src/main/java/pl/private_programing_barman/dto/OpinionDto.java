package pl.private_programing_barman.dto;

import java.util.ArrayList;
import java.util.List;

public class OpinionDto {
    private int id;

    private String nickname;
    private String content;
    private int rate;


    public OpinionDto(int id, String nickname, String content, int rate) {
        this.id=id;
        this.nickname = nickname;
        this.content = content;
        this.rate = rate;
    }

    public OpinionDto() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
