public class Author {
    String name,email;
    char gender;
    public void Author(String name1,String email1,char gender1){
        this.name=name1;
        this.email=email1;
        this.gender=gender1;
    }
    public String getName(){return name;}
    public String getEmail(){return email;}
    public void setEmail(String email1){this.email = email1;}
    public char getGender(){return gender;}

    @Override
    public String toString() {
    if(gender==0) {return "Author {" + "name='" + name + '\'' + ", email='" + email + '\''+", gender=" + "female" + '}';
    }else{return "Author {" + "name='" + name + '\'' + ", email='" + email + '\''+", gender=" + "male" + '}';}
}}
