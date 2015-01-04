package com.jfinal.codeonline.designer.dwz.task.processor;

import com.google.common.collect.Lists;
import com.jfinal.codeonline.ext.TaskKit;
import com.jfinal.codeonline.designer.dwz.project.Project;
import com.jfinal.codeonline.designer.dwz.task.Task;

import java.util.List;
import java.util.Map;

public class SingleTaskProcessor implements ITaskProcessor {
    @Override
    public List<String> run(Project project, Task task, Map<String, Object> context) {
        return Lists.newArrayList(TaskKit.processTemplate(context, task));

    }
}
