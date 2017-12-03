package com.example.multimeet.things2do.ui.home;

import android.arch.lifecycle.ViewModel;

import com.example.multimeet.things2do.DataSource;
import com.example.multimeet.things2do.presistence.model.LocalTaskDataSource;
import com.example.multimeet.things2do.presistence.model.Task;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

/**
 * Created by multimeet on 1/12/17.
 */

public class TaskViewModel extends ViewModel {

    private DataSource dataSource;

    public TaskViewModel(DataSource dataSource){
        this.dataSource=dataSource;
    }

    public Flowable<List<Task>> getAllTasks(){
        return dataSource.getAll();
    }

    public Flowable<Task> getTask(String id){
        return dataSource.get(id);
    }

    public Completable insertTask(Task task){
        return Completable.fromAction(()->{
           dataSource.insert(task);
        });
    }

    public Completable delete(Task task){
        return Completable.fromAction(()->{
            dataSource.delete(task);
        });
    }

    public Completable update(Task task){
        return Completable.fromAction(()->{
           dataSource.update(task);
        });
    }
}
