package se.lexicon;


import se.lexicon.util.PlayerUtil;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<Player> newPlayer = new ArrayList<>();
        Player player1 = new Player(1, "Sebastian");
        newPlayer.add(player1);
        PlayerUtil.serialize(newPlayer, "players.ser");

    }
}
