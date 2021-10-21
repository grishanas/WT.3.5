package com.bsuir.Task11;


public class ProgrammerBook extends Book
{
    private String language;
    private  int level;

    public ProgrammerBook(String title,String author,int price,int edition,String language,int level)
    {
        super(title,author,price,edition,3);
        this.language=language;
        this.level=level;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null||obj.getClass()!=this.getClass())
            return false;
        ProgrammerBook ProgBook= (ProgrammerBook)obj;
        if(super.equals(ProgBook))
            return (ProgBook.language!=null&&language!=null)&&(language.equals(ProgBook.language))&&(level==ProgBook.level);
        return false;
    }

    @Override
    public String toString()
    {
        return super.toString()+" Level:"+level+" language:"+language;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode()+3*level+language.hashCode();
    }
}
