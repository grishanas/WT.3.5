package bsuir.by.client;

import bsuir.by.server.Server;

public class Main {
    public static void main(String[] args)
    {
        if("client".equals(args[0]))
            new client();
        if("server".equals(args[0]))
            new Server();
    }
}
