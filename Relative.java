package f06_Defining_Classes.Google;

public class Relative {
    private String childName;
    private String birthday;

    public Relative(String childName, String birthday){
        this.childName = childName;
        this.birthday = birthday;
    }

    public String toString(){
        return String.format("%s %s", this.childName, this.birthday);
    }

}
