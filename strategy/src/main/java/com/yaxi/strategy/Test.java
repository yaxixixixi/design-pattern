package com.yaxi.strategy;

import com.yaxi.strategy.data.BirdA;
import com.yaxi.strategy.data.BirdB;
import com.yaxi.strategy.data.BirdC;

/**
 * Created by yaxi on 2017/11/21.
 */

public class Test {

    public static void testFly(){

        BirdA birdA = new BirdA();
        BirdB birdB = new BirdB();
        BirdC birdC = new BirdC();

        birdA.display();
        birdA.eat();
        birdA.run();
        birdA.performFly();

        birdB.display();
        birdB.eat();
        birdB.run();
        birdB.performFly();

        birdC.display();
        birdC.eat();
        birdC.run();
        birdC.performFly();
    }


}
