package com.BoardGameNight.registration.model;

import javax.persistence.*;

@Entity
@Table(name = "user_games")
public class UserGames {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User userGames;

    @ManyToOne
    @JoinColumn(name = "games_id")
    Games gamesU;

    public String getGameApiId(){
        return gamesU.getGame_api_id();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserGames() {
        return userGames;
    }

    public void setUserGames(User userGames) {
        this.userGames = userGames;
    }

    public Games getGamesU() {
        return gamesU;
    }

    public void setGamesU(Games gamesU) {
        this.gamesU = gamesU;
    }
}
