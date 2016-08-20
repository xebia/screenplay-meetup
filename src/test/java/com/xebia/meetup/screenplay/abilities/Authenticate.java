package com.xebia.meetup.screenplay.abilities;

import com.xebia.meetup.screenplay.exceptions.CannotAuthenticateException;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class Authenticate implements Ability {

    // TODO: fix these getter methods
    public String username() { return ""; }
    public String password() { return ""; }

    // TODO: implement this method to return a Authenticate Ability instance
    public static Authenticate withCredentials(String username, String password) {
        return null;
    }


    // Some additional methods for serenity's inner working, ignore for now

    public static Authenticate as(Actor actor) {
        if (actor.abilityTo(Authenticate.class) == null) {
            throw new CannotAuthenticateException(actor.getName());
        }
        return actor.abilityTo(Authenticate.class).asActor(actor);
    }

    @Override
    public <T extends Ability> T asActor(Actor actor) {
        return (T) this;
    }
}
