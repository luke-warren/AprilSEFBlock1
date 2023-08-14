package org.example;

public class VideoFile extends File implements Playable{

    private String transcript;

    public VideoFile(int memory, String name, String transcript) {
        super(memory, name);
        this.transcript = transcript;
    }

//    @Override
//    public int getMemory(){
//        return 10;
//    }
    @Override
    public void read(){
        System.out.println(this.transcript);
    }

    @Override
    public boolean save(){
        //Saving code
        System.out.println("File was saved");
        return true;
    }

    @Override
    public  boolean saveAs(String name){
        //Saving code
        System.out.println("File was saved as: " + name);
        return  true;
    }

    @Override
    public void play() {
        System.out.println("Video is playing");
    }
}
