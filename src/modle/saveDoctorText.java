package modle;

import java.io.Serializable;

public class saveDoctorText implements Serializable {
     private static final long serialVersionUID = 1L;
      private String NationCode;
       private String Text;
       
       public final void setNationCode(String nationcode){
        this.NationCode = nationcode;
    }
        public final void setText(String text){
        this.Text = text;
    }
        
        public saveDoctorText(String NationalCode, String Text){
             this.setText(Text);
             this.setNationCode(NationalCode);
        }
}
