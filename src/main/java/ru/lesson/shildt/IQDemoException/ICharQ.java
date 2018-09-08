package ru.lesson.shildt.IQDemoException;

public interface ICharQ {
    // Put a character in the queue
    void put(char ch) throws QueueFullException;

    // Get a character from the queue
    char get() throws QueueEmtyException;
}