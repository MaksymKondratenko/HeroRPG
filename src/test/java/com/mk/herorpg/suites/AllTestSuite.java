package com.mk.herorpg.suites;

import com.mk.herorpg.DAO.DBInitializerTest;
import com.mk.herorpg.DAO.PropertyAgentTest;
import com.mk.herorpg.actionImpl.activities.DreamActionProcessorTest;
import com.mk.herorpg.actionImpl.activities.StudyActionProcessorTest;
import com.mk.herorpg.actionImpl.activities.WorkActionProcessorTest;
import com.mk.herorpg.actionImpl.body.BodyActionProcessorTest;
import com.mk.herorpg.actionImpl.books.BookActionProcessorTest;
import com.mk.herorpg.actionImpl.enjoyment.EnjoymentActionProcessorTest;
import com.mk.herorpg.actionImpl.food.FoodActionProcessorTest;
import com.mk.herorpg.actionImpl.washing.WashingActionProcessorTest;
import com.mk.herorpg.utils.TimeTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DreamActionProcessorTest.class, StudyActionProcessorTest.class, WorkActionProcessorTest.class,
        BodyActionProcessorTest.class, BookActionProcessorTest.class, EnjoymentActionProcessorTest.class,
        FoodActionProcessorTest.class, WashingActionProcessorTest.class, DBInitializerTest.class,
        PropertyAgentTest.class,TimeTest.class})
public class AllTestSuite {
}
