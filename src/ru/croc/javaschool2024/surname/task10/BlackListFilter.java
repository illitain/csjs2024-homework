package ru.croc.javaschool2024.surname.task10;

import java.util.List;
import java.util.Set;

public interface BlackListFilter {

    /**
     * From the given list of comments removes ones
     * that contain words from the black list.
     *
     * @param comments  list of comments; every comment
     *                  is a sequence of words, separated
     *                  by spaces, punctuation or line breaks
     * @param blackList set of words that should not
     *                  be present in a comment
     */
    void filterComments(List<String> comments, Set<String> blackList);
}
