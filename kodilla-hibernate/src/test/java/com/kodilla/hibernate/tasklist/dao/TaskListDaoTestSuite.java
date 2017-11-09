package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test name of the List";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "Temporary list description");
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTasks =taskListDao.findByListName(listName);
        TaskList readTask = taskListDao.findOne(1);

        //Then
        Assert.assertEquals(1, readTasks.size());
        Assert.assertEquals(LISTNAME, listName);
        //CleanUp
        int id = readTasks.get(0).getId();
        taskListDao.delete(id);
    }
}
