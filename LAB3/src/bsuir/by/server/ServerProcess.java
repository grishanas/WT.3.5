package bsuir.by.server;

import java.io.*;
import java.net.Socket;

public class ServerProcess implements Runnable
{
    private Server server;
    private Socket client;
    public ServerProcess(Server server, Socket client)
    {
        this.server=server;
        this.client=client;

    }
    @Override
    public void run()
    {
        try{
            BufferedReader reader= new BufferedReader(new InputStreamReader(client.getInputStream()));
            var OutObj=new ObjectOutputStream(client.getOutputStream());
            var InObj= new ObjectInputStream(client.getInputStream());
            var OutMess = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())),true);

            OutMess.println(server.GetStudents().size());


            while(!client.isClosed())
            {
                for(var Item:server.GetStudents())
                {
                    OutObj.writeObject(Item);
                }
                OutObj.flush();
                String Request = reader.readLine();
                switch (Request){
                    case ("Exit"):
                    {
                        reader.close();
                        OutObj.close();
                        InObj.close();
                        client.close();
                        break;
                    }
                    case ("Create"):{
                        var Student = (bsuir.by.server.Student)InObj.readObject();
                        server.AddNewStudent(Student);
                        OutMess.println("Successful creation of a new element");
                        break;
                    }
                    case ("Change"):{
                        OutMess.println("Enter index");
                        var index = Integer.parseInt(reader.readLine());
                        var Student = server.GetStudents().get(index);
                        OutObj.writeObject(Student);
                        var newstudent = (Student)InObj.readObject();
                        server.ChangeItem(Student,newstudent);
                        OutMess.println("Successful chenge element");
                        break;
                    }
                }
            }
        }catch (Exception e){

        }

    }

}
