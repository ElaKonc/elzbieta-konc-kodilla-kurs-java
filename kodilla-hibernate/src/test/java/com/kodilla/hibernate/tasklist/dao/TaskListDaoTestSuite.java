package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    private static final String DESCRIPTION = "Test find by list name";

    @Test
    public void testFindByListName() {
        TaskList taskList = new TaskList("Nowe", DESCRIPTION);

        taskListDao.save(taskList);

        int id = taskList.getId();

        Optional<TaskList> readTaskList = taskListDao.findById(id);
        Assert.assertTrue(readTaskList.isPresent());

        taskListDao.deleteById(id);
    }
}
