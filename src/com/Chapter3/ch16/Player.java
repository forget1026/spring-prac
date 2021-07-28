package com.Chapter3.ch16;

public class Player {
    private PlayerLevel playerLevel;

    public Player() {
        this.playerLevel = new BeginnerLevel();
        playerLevel.showLevelMessage();
    }

    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.playerLevel = level;
        this.playerLevel.showLevelMessage();
    }

    public void play(int count) {
        playerLevel.go(count);
    }
}
