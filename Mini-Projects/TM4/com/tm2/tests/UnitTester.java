package com.tm2.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tm2.bean.Video;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    VideoTest.class,
    VideoStoreTest.class
})

public class UnitTester {

    public class AllTests {

    }
}
