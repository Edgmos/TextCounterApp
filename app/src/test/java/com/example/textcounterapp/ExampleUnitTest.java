package com.example.textcounterapp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.textcounterapp.utils.TextUtils;

public class ExampleUnitTest {
    @Test
    public void getCharsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_TenCharsString_Result_Ten() {
        String givenString = "1234567890";
        int expectedValue = 10;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void getCharsCount_Given_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getCharsCount(givenString);
    }

    @Test
    public void getCharsCount_Given_SixSpacesString_Result_Six() {
        String givenString = "      ";
        int expectedValue = 6;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_SevenCommasString_Result_Seven() {
        String givenString = ",,,,,,,";
        int expectedValue = 7;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_RandomFiveCharsString_Result_Five() {
        String givenString = ", %j*";
        int expectedValue = 5;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_EmptyString_Result_Zero() {
        String[] givenStringWord = {};
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenStringWord);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_SixCharsString_Result_One() {
        String givenStringWord = "abcdef";
        String[] givenStringWordSplitted = givenStringWord.split("\\s+");
        int expectedValue = 1;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplitted);

        assertEquals(expectedValue, actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void getWordsCount_Given_NullString_Result_Exception() {
        String[] givenStringWord = null;
        int actualValue = TextUtils.getWordsCount(givenStringWord);
    }

    @Test
    public void getWordsCount_Given_SixSpacesString_Result_Zero() {
        String givenStringWord = "      ";
        String[] givenStringWordSplitted = givenStringWord.split("\\s+");
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplitted);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_SevenCommasString_Result_One() {
        String givenStringWord = ",,,,,,,";
        String[] givenStringWordSplitted = givenStringWord.split("\\s+");
        int expectedValue = 1;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplitted);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_RandomSixCharsStringWithSpaces_Result_Two() {
        String givenStringWord = "my name";
        String[] givenStringWordSplitted = givenStringWord.split("\\s+");
        int expectedValue = 2;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplitted);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_RandomFiveCharsString_WithSpace_Result_Two() {
        String givenStringWord = ", %j*";
        String[] givenStringWordSplitted = givenStringWord.split("\\s+");
        int expectedValue = 2;
        int actualValue = TextUtils.getWordsCount(givenStringWordSplitted);

        assertEquals(expectedValue, actualValue);
    }
}