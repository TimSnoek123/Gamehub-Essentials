package com.gamehub.essentials.Abstractions;

import com.gamehub.essentials.Abstractions.Enums.LobbyState;
import com.gamehub.essentials.Abstractions.Enums.LobbyType;

import java.util.ArrayList;

public abstract class AbstractLobby {

    protected String id;
    protected String name;
    protected AbstractGame game;
    protected LobbyType type;
    protected LobbyState state;
    protected int minUserCount;
    protected int maxUserCount;
    protected ArrayList<AbstractUser> users;

    public AbstractLobby(String id, String name, AbstractGame game, LobbyType type, LobbyState state, int minUserCount, int maxUserCount, ArrayList<AbstractUser> users) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.type = type;
        this.state = state;
        this.minUserCount = minUserCount;
        this.maxUserCount = maxUserCount;
        this.users = users;
    }

    public AbstractLobby() {
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

    public AbstractGame getGame() {
        return game;
    }

    public void setGame(AbstractGame game) {
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

    public ArrayList<AbstractUser> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<AbstractUser> users) {
        this.users = users;
    }
}
