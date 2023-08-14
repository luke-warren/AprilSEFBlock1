package org.example;

public abstract class File {

    private int memory;
    private String name;

    public File(int memory, String name){
        this.memory = memory;
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void read();

    public abstract boolean save();

    public abstract boolean saveAs(String name);
}


