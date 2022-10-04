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
    private Drink drink;

   @Column(insertable = false, updatable = false)
   private int drink_id;

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

    public int getDrinkId() {
        return drink_id;
    }

    public void setDrinkId(int drink_id) {
        this.drink_id = drink.getId();
    }

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
