package com.mk.herorpg.suites;

import com.mk.herorpg.DAO.DBInitializerTest;
import com.mk.herorpg.DAO.PropertyAgentTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DBInitializerTest.class, PropertyAgentTest.class})
public class DBTestSuite {
}
