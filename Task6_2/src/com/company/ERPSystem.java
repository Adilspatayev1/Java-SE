package com.company;

public class ERPSystem {
    private User[] memory = new User[1000];
    private int sizeOfUsers = 0;

    public ERPSystem() {
    }

    public void addUser(User u){
        u.setId(sizeOfUsers);
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printAllStudents(){
        for(int i = 0;i < sizeOfUsers;i++){
            if(memory[i] instanceof Student){
                System.out.println(memory[i].getUserData());
            }
        }
    }

    public void printAllTeachers(){
        for(int i = 0;i < sizeOfUsers;i++){
            if(memory[i] instanceof Teacher){
                System.out.println(memory[i].getUserData());
            }
        }
    }

    public void printUser(int index){
        boolean b = false;
        if(memory[index] == null){
            System.out.println("No user in this index");
        } else {
            System.out.println(memory[index].getUserData());
        }
    }
}
