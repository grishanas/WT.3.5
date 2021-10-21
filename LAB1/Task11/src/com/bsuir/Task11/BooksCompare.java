package com.bsuir.Task11;
import java.util.Comparator;

public class BooksCompare {

    public static Comparator<Book> byTitle=(a, b)->
    {
        return a.GetTitle().compareToIgnoreCase(b.GetTitle());
    };
    public static Comparator<Book> byAuthor = (a, b) -> {
        return a.GetAuthor().compareToIgnoreCase(b.GetAuthor());
    };

    public static Comparator<Book> byPrice = Comparator.comparingInt(book -> book.GetPrice());

    public static Comparator<Book> byTitleThanAuthor = byTitle.thenComparing(byAuthor);
    public static Comparator<Book> byAuthorThanTitle = byAuthor.thenComparing(byTitle);
    public static Comparator<Book> byAuthorThanTitleThanPrice = byAuthor
            .thenComparing(byTitle).thenComparing(byPrice);
}
