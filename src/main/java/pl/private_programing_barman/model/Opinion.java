package pl.private_programing_barman.model;

import javax.persistence.*;

@Entity
@Table(name = "opinions")
public class Opinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nickname;
    private String content;
    private int rate;

   @ManyToOne
   @JoinColumn(name="drink_id")
    private Drink drink;

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

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    //    public Opinion(String nickname, String content, int rate, Drink drink) {
//        this.nickname = nickname;
//        this.content = content;
//        this.rate = rate;
//        this.drink = drink;
//    }

    @Override
    public String toString() {
        return "Opinion{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", content='" + content + '\'' +
                ", rate=" + rate +
                '}';
    }
}
