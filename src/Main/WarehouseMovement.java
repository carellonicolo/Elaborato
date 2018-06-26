package Main;

import java.util.GregorianCalendar;

public abstract class WarehouseMovement{
    
        protected GregorianCalendar data;
       

        //GET - DATA
        public GregorianCalendar getData(){
            return data;
        }
        
        public String getDataInString(){
            return ""+data.get(GregorianCalendar.DATE)+"/"+data.get(GregorianCalendar.MONTH)+"/"+data.get(GregorianCalendar.YEAR);
        }
        
        //SET DATA
        public void setData(GregorianCalendar data){
            this.data = data;
        }
        
        public void setData(){
            this.data = new GregorianCalendar();
        }
        
        public void setData(int d, int m, int y){
            this.data = new GregorianCalendar(y, m, d);
        }
        
        
        
        
        
        public int getID(){
            return hashCode();
        }
        
        public String getIDtoString(){
            return ""+hashCode();
        }
        
        
        
        
        @Override
        public abstract int hashCode();
        
        @Override
        public abstract String toString();
        
}
