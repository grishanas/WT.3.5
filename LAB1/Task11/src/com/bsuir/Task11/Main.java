package com.bsuir.Task11;

public class Main {

    public static void main(String[] args)
    {
        ProgrammerBook pgbk= new ProgrammerBook("java","daket",32,1,"java",0);
        ProgrammerBook pgbk1= new ProgrammerBook("java","daket",32,1,"java",0);
        Book firstBook=new Book("название1","автор1",10,1,2);
        Book firstBook1=new Book("название2","автор1",10,1,1);


        System.out.println(firstBook.equals(firstBook1));
        System.out.println(firstBook1.equals(pgbk1));
        System.out.println(pgbk.equals(pgbk1));
        System.out.println(pgbk.toString());



    }
}
