package main.inline;

/**
 * Created by michaelpollind on 12/1/16.
 */
public class CharacterConstant extends  Primary{
    private  String character;
    public CharacterConstant(String entry) {
        super();
        this.character = entry.substring(1);
    }

    @Override
    public String getResult() {
        return  "'"+ this.character+ "'";
    }
}
