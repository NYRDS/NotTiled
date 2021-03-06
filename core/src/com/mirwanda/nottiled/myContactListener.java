package com.mirwanda.nottiled;

import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.Manifold;

import static com.mirwanda.nottiled.obj.objecttype.POINTER;

public class myContactListener implements ContactListener {
        MyGdxGame game;
        public myContactListener(MyGdxGame game){
            this.game=game;
        }

        @Override
        public void beginContact(Contact contact) {
            Fixture fixA = contact.getFixtureA();
            Fixture fixB = contact.getFixtureB();
            if (fixA.getUserData() == POINTER){
                game.checkBox2D((obj) fixB.getUserData());

            }
            if (fixB.getUserData() == POINTER){
                game.checkBox2D((obj) fixA.getUserData());

            }

              //  Gdx.app.log("TEST","COLLIDED");


        }

        @Override
        public void endContact(Contact contact) { }

        @Override
        public void preSolve(Contact contact, Manifold oldManifold) { }

        @Override
        public void postSolve(Contact contact, ContactImpulse impulse) { }


}
