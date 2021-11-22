package com.bsuir.LAB2.DAO;

/**
 * A class for creating a DAO
 */
public final class DAOFactory
{
    /**
     * Creating a DAO
     * @param FileName file name
     * @param Type  DAO type
     * @return DAO
     */
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
