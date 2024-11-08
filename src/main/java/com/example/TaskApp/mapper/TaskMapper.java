package com.example.TaskApp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.TaskApp.model.Task;

@Mapper
public interface TaskMapper {
    @Insert("INSERT INTO tasks(nombre, descripcion, fecha_inicio) VALUES(#{nombre}, #{descripcion}, #{fechaInicio})")
    void insert(Task task);

    @Select("SELECT * FROM tasks")
    List<Task> getAllTasks();

    @Delete("DELETE FROM tasks WHERE id = #{id}")
    void deleteTaskById(Long id);
}
