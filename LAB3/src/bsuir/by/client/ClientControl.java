package bsuir.by.client;

import bsuir.by.server.Student;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientControl extends Thread{



    public ClientControl()
    {


    }

    @Override
    public void run()
    {
        try{
            var Socket = new Socket(InetAddress.getLocalHost(),(777));
            PrintWriter outMess = new PrintWriter(new BufferedWriter(new OutputStreamWriter(Socket.getOutputStream())), true);
            BufferedReader reader =new BufferedReader(
                    new InputStreamReader(Socket.getInputStream()));
            ObjectOutputStream outObj = new ObjectOutputStream (Socket.getOutputStream());
            ObjectInputStream inObj = new ObjectInputStream(Socket.getInputStream());

            int CountStudent = Integer.parseInt(reader.readLine());
            for(int i=0;i<CountStudent;i++)
            {
                try {
                    Student info = (Student) inObj.readObject();
                    System.out.println(info.toString());
                }
                catch (Exception e)
                {

                }
            }
            Scanner inputClient = new Scanner(System.in);
            while(true) {
                String Mes=inputClient.next();
                switch (Mes){
                    case("Help"):
                    {
                        System.out.println("for exit enter-Exit");
                        System.out.println("for change item - Change");
                        System.out.println("for creation item - Create");
                        break;
                    }
                    case("Exit"):
                    {
                        outMess.println("Exit");
                        return;

                    }
                    case("Create"):
                    {
                        Student newStud= new Student();
                        System.out.println("Name");
                        newStud.SetName(inputClient.next());
                        System.out.println("Surname");
                        newStud.SetSurname(inputClient.next());
                        System.out.println("Patronymic");
                        newStud.SetPatronymic(inputClient.next());
                        System.out.println("age");
                        newStud.SetAge(Integer.parseInt(inputClient.next()));
                        System.out.println("ID");
                        newStud.SetID(Integer.parseInt(inputClient.next()));
                        System.out.println("StudentID");
                        newStud.SetStudentID(Integer.parseInt(inputClient.next()));
                        System.out.println("Description");
                        newStud.SetDescription(inputClient.next());
                        outMess.println("Create");
                        outObj.writeObject(newStud);
                        System.out.println(reader.readLine());
                        break;
                    }
                    case("Change"):
                    {
                        System.out.println(reader.readLine());
                        outMess.println(reader.readLine());
                        try {
                            var stud = (Student) inObj.readObject();
                        }
                        catch (Exception e){

                        }
                        Student newStud= new Student();
                        System.out.println("Name");
                        newStud.SetName(inputClient.next());
                        System.out.println("Surname");
                        newStud.SetSurname(inputClient.next());
                        System.out.println("Patronymic");
                        newStud.SetPatronymic(inputClient.next());
                        System.out.println("age");
                        newStud.SetAge(Integer.parseInt(inputClient.next()));
                        System.out.println("ID");
                        newStud.SetID(Integer.parseInt(inputClient.next()));
                        System.out.println("StudentID");
                        newStud.SetStudentID(Integer.parseInt(inputClient.next()));
                        System.out.println("Description");
                        newStud.SetDescription(inputClient.next());
                        outMess.println("Create");
                        outObj.writeObject(newStud);
                        System.out.println(reader.readLine());
                        break;
                    }
                }
            }

        }
        catch (IOException e)
        {

        }



    }
}
