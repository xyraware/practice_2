public class Computer {
    String name,processor,videocard;
    int year_realise;
    public void setName(String name1){this.name=name1;}
    public void setVideocard(String videocard1){this.videocard=videocard1;}
    public void setProcessor(String processor1){this.processor=processor1;}
    public void setYear(int year1){this.year_realise=year1;}
    public void setAll(String name1,String processor1,String videocard1,int year1){
        this.name=name1;this.processor=processor1;this.videocard=videocard1;this.year_realise=year1;
    }
    public String getName(){return this.name;}
    public String getProcessor(){return this.processor;}
    public String getVideocard(){return this.videocard;}
    public int getYear_realise() {return year_realise;}

    @Override
    public String toString() {
        return "Computer{" + "name='" + name + '\'' + ", processor='" + processor + '\'' + ", videocard='" + videocard + '\'' + ", year_realise=" + year_realise + '}';
    }
}
