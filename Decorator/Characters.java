package Decorator;

public interface Characters {
    public String getAbilities();

    public static void main(String[] args) {
        Characters mario = new Mario();
        System.out.println("Basic Character" + mario.getAbilities());

        mario = new HeightDec(mario);
        System.out.println("Character with Height Up - " + mario.getAbilities());

        mario = new GunPower(mario);
        System.out.println("Character with Gun Power - " + mario.getAbilities());

        mario = new StarPower(mario);
        System.out.println("Character with Star Power - " + mario.getAbilities());
    }
}

class Mario implements Characters {
    @Override
    public String getAbilities() {
        return "Mario";
    }
}

abstract class CharactersDecorator implements Characters {
    protected Characters character;

    CharactersDecorator(Characters character) {
        this.character = character;
    }
}

class HeightDec extends CharactersDecorator {
    public HeightDec(Characters character) {
        super(character);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities()+" with HeightUp";
    }
}

class GunPower extends CharactersDecorator {
    public GunPower(Characters character) {
        super(character);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + " with GunPower";
    }
}

class StarPower extends CharactersDecorator {
    public StarPower(Characters character) {
        super(character);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities()+" with StarPower for limited Time";
    }
}







