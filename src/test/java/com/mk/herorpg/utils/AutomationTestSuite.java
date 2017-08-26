package com.mk.herorpg.utils;

import com.mk.herorpg.actionImpl.activities.DreamActionProcessorTest;
import com.mk.herorpg.actionImpl.activities.StudyActionProcessorTest;
import com.mk.herorpg.actionImpl.activities.WorkActionProcessorTest;
import com.mk.herorpg.actionImpl.books.BookActionProcessorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DreamActionProcessorTest.class, StudyActionProcessorTest.class,
        WorkActionProcessorTest.class, BookActionProcessorTest.class, TimeTest.class})
public class AutomationTestSuite {
}
