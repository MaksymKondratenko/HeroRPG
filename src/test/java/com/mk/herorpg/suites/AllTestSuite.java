package com.mk.herorpg.suites;

import com.mk.herorpg.DAO.DBInitializerTest;
import com.mk.herorpg.DAO.PropertyAgentTest;
import com.mk.herorpg.actionimpl.activities.DreamActionProcessorTest;
import com.mk.herorpg.actionimpl.activities.StudyActionProcessorTest;
import com.mk.herorpg.actionimpl.activities.WorkActionProcessorTest;
import com.mk.herorpg.actionimpl.body.BodyActionProcessorTest;
import com.mk.herorpg.actionimpl.books.BookActionProcessorTest;
import com.mk.herorpg.actionimpl.enjoyment.EnjoymentActionProcessorTest;
import com.mk.herorpg.actionimpl.food.FoodActionProcessorTest;
import com.mk.herorpg.actionimpl.washing.WashingActionProcessorTest;
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
