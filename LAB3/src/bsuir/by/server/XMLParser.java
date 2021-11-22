package bsuir.by.server;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {
    private String FilePath;
    private List<Student> students = new ArrayList<>();

    public List<Student> ReadStudent()
    {
        Document doc;

        try{
            doc= DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(FilePath));
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }

        Node RootNode = doc.getFirstChild();
        NodeList nodeList = RootNode.getChildNodes();

        for(int i=0;i< nodeList.getLength();i++)
        {
            if(nodeList.item(i).getNodeType()!=Node.ELEMENT_NODE)
                continue;
            NodeList Item = nodeList.item(i).getChildNodes();
            var Student= new Student();
            for(int j=0;j<Item.getLength();i++) {
                if(Item.item(j).getNodeType()!=Node.ELEMENT_NODE)
                    continue;
                Node Property = Item.item(j);
                switch (Property.getNodeName())
                {
                    case "ID":{
                        Student.SetID(Integer.parseInt(Property.getTextContent()));
                        break;
                    }
                    case "Name":{
                        Student.SetName(Property.getTextContent());
                        break;
                    }
                    case "Surname":{
                        Student.SetSurname((Property.getTextContent()));
                        break;
                    }
                    case "Patronymic":{
                        Student.SetPatronymic((Property.getTextContent()));
                        break;
                    }
                    case "age":{
                        Student.SetAge(Integer.parseInt(Property.getTextContent()));
                        break;
                    }
                    case "StudentID":{
                        Student.SetStudentID(Integer.parseInt(Property.getTextContent()));
                        break;
                    }
                    case "Description":{
                        Student.SetDescription((Property.getTextContent()));
                        break;
                    }


                }
            }
            students.add(Student);
        }
        return students;
    }

    public List<Student> GetList()
    {
        return students;
    }

    public XMLParser(String Filename)
    {
        FilePath=Filename;
    }

    public void SaveStudents(List<Student> students)
    {
        var factory= DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try{
            builder=factory.newDocumentBuilder();
            var Doc=builder.newDocument();
            var Root=Doc.createElement("Root");
            Doc.appendChild(Root);
            for(var Item:students)
            {
                Root.appendChild(CreateNode(Doc,Item));
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource Source = new DOMSource(Doc);
            StreamResult file = new StreamResult(new File(FilePath));
            transformer.transform(Source, file);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    private Node CreateNode(Document Doc,Student Student)
    {
        Element Node=Doc.createElement("Student");
        Node.appendChild(CreateNodeElement(Doc,"ID",String.valueOf(Student.GetId())));
        Node.appendChild(CreateNodeElement(Doc,"Name",Student.GetName()));
        Node.appendChild(CreateNodeElement(Doc,"Surname",Student.GetSurname()));
        Node.appendChild(CreateNodeElement(Doc,"Patronymic",Student.GetPatronymic()));
        Node.appendChild(CreateNodeElement(Doc,"Description",Student.GetDescription()));
        Node.appendChild(CreateNodeElement(Doc,"age",String.valueOf(Student.GetAge())));
        Node.appendChild(CreateNodeElement(Doc,"StudentID",String.valueOf(Student.GetStudentID())));
        return Node;
    }

    private Node CreateNodeElement(Document doc,String Key,String Value)
    {
        Element Node = doc.createElement(Key);
        Node.appendChild(doc.createTextNode(Value));
        return Node;
    }
}
