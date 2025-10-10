package de.month_1.fundamentals.day_18.thissuper;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        ThisSuperTasksTest.class,
        BirdSuperTest.class
})
public class AllTestsOfDay_17 {
}
