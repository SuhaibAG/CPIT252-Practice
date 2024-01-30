package courseinfo;

public class Admission{
    public Course admittingCourse (String courseName){
        if (courseName == null){
            return null;
        }
        if(courseName.equalsIgnoreCase("Computer")){
            return new Computer();
        }
        else if(courseName.equalsIgnoreCase("CivilServices")){
            return new CivilServices();
        }
        else if(courseName.equalsIgnoreCase("Health")){
            return new Health();
        }
        return null;
    }


}
