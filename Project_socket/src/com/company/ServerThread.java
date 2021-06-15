package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
    Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try{
            DBManager dbManager = new DBManager();

            dbManager.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData pd = null;

            while ((pd = (PackageData)inputStream.readObject()) != null){
                if(pd.getOperationType().equals("ADD")){
                    Student studentFromClient = pd.getStudent();
                    dbManager.addStudent(studentFromClient);
                }
                else if(pd.getOperationType().equals("LIST")){
                    ArrayList<Student> infoFromDB = dbManager.getAllStudents();
                    PackageData toClient = new PackageData(infoFromDB);
                    outputStream.writeObject(toClient);
                }
            }
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
