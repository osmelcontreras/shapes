import java.awt.Color;
import java.awt.Graphics;

public class Rectangle {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private Color fillColor;
	
		
	double width1;
	
	    double height1;
	
	           
	
	    public void rectangle(){
	
	       width=1;
	
	       height=1;
	
	        
	
	    }
	
	     
	
	    public void rectangle(double W, double hi){
	
	       this.width =(int) W;
	
	       this.height=(int) hi;
	
	        
	
	    }
	
	 
	
	    public void setWidth(double w){
	
	       width=(int) w;
	
	    }
	
	 
	
	    public void setHeight(double h){
	
	       height=(int) h;
	
	    }
	
	    
	
	    public double getWidth(){
	
	       return width;
	
	    }
	
	    
	
	    public double getHeight(){
	
	       return height;
	
	    }
	
	 
	
	       public double getArea(){
	
	       return width* height;
	
	                
	
	    }
	
	    public double getPerimeter(){
	
	       return (2*height)+(2*width);
	
	    }
	
	}
	
	 
