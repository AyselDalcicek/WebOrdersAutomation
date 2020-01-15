package com.weborders.step_definitions;

import com.weborders.utilities.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void setup(){

    }


    @After
    public void teardown(){
        Driver.close();
    }
}
