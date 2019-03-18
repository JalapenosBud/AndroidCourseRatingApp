package com.example.courseapp;

public enum QuestionnareRating {
    A(100),
    B(90),
    C(80),
    D(70),
    E(60),
    F(50);

    int rating;

    QuestionnareRating(int rating)
    {
        this.rating = rating;
    }
}
