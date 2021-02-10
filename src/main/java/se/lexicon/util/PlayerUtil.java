package se.lexicon.util;

import se.lexicon.Player;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class PlayerUtil {

    public static List <Player> serialize (List <Player> source, String filePath){
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)
                ){
            out.writeObject(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return source;
    }

}


