package com.bsuir.LAB2.DAO;

public final class DAOFactory
{
    public static IDAO CreateDAO(String FileName,DAOType Type)
    {
        IDAO DAO=null;
        switch (Type){
            case DAO:
                DAO=new DAO(FileName);
                break;
        }
        return DAO;
    }
}
