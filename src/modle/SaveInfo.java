package modle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public  class SaveInfo implements Serializable  {
        private static final long serialVersionUID = 1L;

    private String Name;
    private String LastName;
    private String NationCode;
    private String Sex;
    private String PassWord;
    private String Age;
    private String Text;

    
    public SaveInfo(String name,String lastname,String nationcode,String sex,String password,String age,String text) throws FileNotFoundException, IOException{
        this.setName(name);
        this.setAge(age);
        this.setLastName(lastname);
        this.setNationCode(nationcode);
        this.setPassWord(password);
        this.setSex(sex);
        this.setText(text);
       
        
    }
    
    public final void setName(String name){
        this.Name = name;
    }
    public final void setLastName(String lastname){
        this.LastName = lastname;
    }
    public final void setSex(String sex){
        this.Sex = sex;
    }
    public final void setPassWord(String password){
       this.PassWord = password;
    }
    public final void setAge(String age){
        this.Age = age;
    }
    public final void setNationCode(String nationcode){
        this.NationCode = nationcode;
    }
    public final void setText(String text){
        this.Text = text;
    }
    
    
    
    public String getName(){
        return Name;
    }
    public String getLastName(){
        return LastName;
    }
    public String getSex(){
        return Sex;
    }
    public String getPassword(){
        return PassWord;
    }
    public String getAge(){
        return Age;
    }
    public String getNationalcode(){
        return NationCode;
    }
    public String getText(){
        return Text;
    }
    
}
