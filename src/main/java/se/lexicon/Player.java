package se.lexicon;

public class Player {
    private int id;
    private String name;

    public Player() {
    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
