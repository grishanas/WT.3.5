package bsuir.by.server;

import java.net.Socket;
import java.net.ServerSocket;
import java.util.List;

public class Server implements Runnable
{
    private ServerSocket ServerSocket;
    private XMLParser Parser;
    private boolean CanStart;
    private List<Student> students;

    public List<Student> GetStudents(){
        return students;
    }

    public void AddNewStudent(Student Student){
        students.add(Student);
        Parser.SaveStudents(students);
    }

    public void DeleteItem(Student student)
    {
        students.remove(student);
    }

    public void ChangeItem(Student lastStudent,Student newStudent)
    {
        DeleteItem(lastStudent);
        AddNewStudent(newStudent);
    }

    public Server(int Socket,String FileName)
    {
        try {
            ServerSocket = new ServerSocket(Socket);
            Parser= new XMLParser(FileName);
            CanStart=true;
        }
        catch (Exception e){
            CanStart=false;
        };
    }

    public Server()
    {
        try {
            ServerSocket = new ServerSocket(777);
            Parser= new XMLParser("Students.xml");
            CanStart=true;
        }
        catch (Exception e){
            CanStart=false;
        };

    }


    @Override
    public void run()
    {
        if(!CanStart)
            return;
        students = Parser.ReadStudent();

        while(true)
        {
            try {
                Socket client = ServerSocket.accept();
                var SerProc= new ServerProcess(this,client);
                SerProc.run();
            }
            catch (Exception e)
            {

            }
        }


    }


}
