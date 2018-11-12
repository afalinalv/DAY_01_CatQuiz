package com.example.day_01_catquiz;

public class Question {
    private int mTextResId;
    private boolean mIsRightAnswer;

    public Question(int textResId, boolean isRightAnswer) {
        mTextResId = textResId;
        mIsRightAnswer = isRightAnswer;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isRightAnswer() {
        return mIsRightAnswer;
    }

    public void setIsRightAnswer(boolean isRightAnswer) {
        mIsRightAnswer = isRightAnswer;
    }
}
/* Класс Question содержит два вида данных: текст вопроса и правильный ответ (да/нет).
 Поле mTextResId объявлено с типом int для хранения идентификатора строкового ресурса с текстом вопроса.
  Это удобно, если мы будем заниматься локализацией.
  */