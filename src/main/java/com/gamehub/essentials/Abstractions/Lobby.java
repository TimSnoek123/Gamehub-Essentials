package com.gamehub.essentials.Abstractions;

import com.gamehub.essentials.Abstractions.Enums.LobbyState;
import com.gamehub.essentials.Abstractions.Enums.LobbyType;

import java.util.ArrayList;

public abstract class Lobby {

    private String id;
    private String name;
    private Game game;
    private LobbyType type;
    private LobbyState state;
    private int minUserCount;
    private int maxUserCount;
    private ArrayList<User> users;

    public Lobby(String id, String name, Game game, LobbyType type, LobbyState state, int minUserCount, int maxUserCount, ArrayList<User> users) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.type = type;
        this.state = state;
        this.minUserCount = minUserCount;
        this.maxUserCount = maxUserCount;
        this.users = users;
    }

    public Lobby() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public LobbyType getType() {
        return type;
    }

    public void setType(LobbyType type) {
        this.type = type;
    }

    public LobbyState getState() {
        return state;
    }

    public void setState(LobbyState state) {
        this.state = state;
    }

    public int getMinUserCount() {
        return minUserCount;
    }

    public void setMinUserCount(int minUserCount) {
        this.minUserCount = minUserCount;
    }

    public int getMaxUserCount() {
        return maxUserCount;
    }

    public void setMaxUserCount(int maxUserCount) {
        this.maxUserCount = maxUserCount;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
