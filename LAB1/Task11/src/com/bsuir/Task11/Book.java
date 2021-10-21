package com.bsuir.Task11;


public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private  int isbn;

    public Book(String title,String author,int price,int edition,int isbn)
    {
        this.title=title;
        this.author=author;
        this.price=price;
        this.edition=edition;
        this.isbn=isbn;
    }

    public String GetAuthor(){
        return author;
    }
    public int GetPrice(){
        return price;
    }
    public String GetTitle(){
        return title;
    }

    public int GetIsbn(){
        return isbn;
    }

    public int compareTo(Book a)
    {
        if (this.isbn - a.isbn > 0)
        return 1;
        if (this.isbn - a.isbn < 0)
            return -1;

        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null||obj.getClass()!=this.getClass())
            return false;
        Book inBook= (Book) obj;
        return (title!=null&&inBook.title!=null)&&(title.equals(inBook.title))&&(author!=null&&inBook.author!=null)&&(author.equals(inBook.author))&&(price==inBook.price);
    }

    @Override
    public String toString()
    {
        return title+" "+author+" price:"+this.price+" "+edition;
    }
    @Override
    public int hashCode()
    {
        int hashCode=1;
        hashCode=31+2*title.hashCode()+(int)1.3*author.hashCode()+price+edition;
        return hashCode;
    }

    public Object Clone()
    {
        return new Book(title,author,price,edition,isbn);
    }

}
