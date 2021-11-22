package bsuir.by.server;

import java.io.Serializable;

public class Student implements Serializable
{
    private int ID;
    private String Name;
    private String Surname;
    private String Patronymic;
    private int age;
    private int StudentID;
    private String Description;


    public Student(int ID,String Name,String Surname,String Patronymic,int age,int StudentID){
        this.Surname=Surname;
        this.Name=Name;
        this.age=age;
        this.ID=ID;
        this.Patronymic=Patronymic;
        this.StudentID=StudentID;
        this.Description="Empty";
    }

    public Student(int ID,String Name,String Surname,String Patronymic,int age,int StudentID,String
            Description){
        this.Surname=Surname;
        this.Name=Name;
        this.age=age;
        this.ID=ID;
        this.Patronymic=Patronymic;
        this.StudentID=StudentID;
        this.Description=Description;
    }
    public  Student(){

    }

    public int GetId(){
        return ID;
    }
    public int GetAge(){
        return age;
    }
    public int GetStudentID()
    {
        return StudentID;
    }
    public String GetDescription(){
        return Description;
    }
    public String GetName()
    {
        return Name;
    }
    public String GetSurname()
    {
        return Surname;
    }
    public String GetPatronymic()
    {
        return Patronymic;
    }

    public void SetID(int ID)
    {
        this.ID=ID;
    }
    public void SetAge(int Age)
    {
        this.age=Age;
    }
    public void SetStudentID(int StudentID)
    {
    this.StudentID=StudentID;
    }

    public void SetDescription(String Description)
    {
        if(Description==null)
            this.Description="Empty";
        else
            this.Description=Description;
    }

    public void SetName(String Name)
    {
        this.Name=Name;
    }
    public void SetSurname(String Surname)
    {
        this.Surname=Surname;
    }
    public void SetPatronymic(String Patronymic)
    {
        this.Patronymic=Patronymic;
    }

    @Override
    public String toString()
    {
        return "ID:"+ID+"  Name:"+Name+"  Surname:"+Surname+"  Patronymic:"+Patronymic+"  age:"+
                age+"  StudentID:"+StudentID+"  Description:"+Description;
    }
}
