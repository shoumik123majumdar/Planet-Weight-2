package planetweight;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// student version
// last modified Nov. 7

import BreezyGUI.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class PlanetWeight extends GBFrame
{
// private variables
private int mercuryX, mercuryY;
private double mercurydist = 0.39;
private double mercurysize = 0.38;
private double mercury = 0.38;

private int venusX, venusY;
private double venusdist = 0.72;
private double venussize = 0.95;
private double venus = 0.78;
private String Venus;


private int marsX, marsY;
private double marsdist = 1.5;
private double marssize = 0.53;
private double mars = 0.39;

private int jupiterX, jupiterY;
private double jupiterdist = 5.2;
private double jupitersize = 11;
private double jupiter = 2.65;

private int saturnX, saturnY;
private double saturndist = 9.5;
private double saturnsize = 9;
private double saturn = 1.17;

private int uranusX, uranusY;
private double uranusdist = 19.2;
private double uranussize = 4;
private double uranus = 1.05;

private int neptuneX, neptuneY;
private double neptunedist = 30.1;
private double neptunesize = 4;
private double neptune = 1.23;

private int plutoX, plutoY;
private double plutodist = 39.5;
private double plutosize = 0.18;
private double pluto = 0.05;

private int earthX, earthY;
private double earthsize = 1;
private double earthdist = 1;
private double earth = 1;

private double sunsize = 109;
private double sundist = 0;

        
private double planetweight;
private String planet;



private double weight;
private int mult = 20;

private int iteration;


// constructor
public PlanetWeight()
{
	setTitle("Guess My Weight");
	iteration = 0;	
}

// runs the program after a mouse click
public void output()
{
    if (planet != "no planet" )
    { messageBox("Your weight is " + planetweight + " pounds on " + planet +
                ". \n  Your weight is " + earthsize + " pounds on earth" );
    }
   

}	

// this method determines which planet the user clicked on
public void mouseClicked (int x, int y)
{
int offset = 30;
   
    int l = x - 30;
    
    int r = x + 30;
    
    int u = y - 30;
    
    int d = y + 30;
    
    
    if ( l < mercuryX &&  mercuryX < r && mercuryY > u && mercuryY < d)
    {
    planet = "Mercury";
    planetweight = earthsize * mercury;
       
    }
    else if (l< venusX && venusX < r && venusY > u && venusY < d)
    {
        planet = "Venus";
     planetweight = earthsize * venus;

          
    }       
   
    else if (l< marsX && marsX < r && marsY > u && marsY < d)
    {
        planet = "Mars";
     planetweight =  earthsize * mars;

          
    }       
     else if (l< earthX && earthX < r && earthY > u && earthY < d)
    {
      planet = "Earth";
     planetweight = earthsize ;
    }
          
        
    else if (l< jupiterX && jupiterX < r && jupiterY > u && jupiterY < d)
    {
      planet = "Jupiter";
     planetweight = jupiter * earthsize;

          
    }       
    
   
   else if (l< saturnX && saturnX < r && saturnY > u && saturnY < d)
    {
      planet = "Saturn";
     planetweight = saturn * earthsize;

          
    }       
    else if (l< neptuneX && neptuneX < r && neptuneY > u && neptuneY < d)
    {
      planet = "Neptune";
     planetweight = neptune * earthsize;

          
    }     
    
    else if (l< uranusX && uranusX < r && uranusY > u && uranusY < d)
    {
      planet = "Uranus";
     planetweight = uranus * earthsize;

          
    }       
    
     
    
    else if (l< plutoX && plutoX < r && plutoY > u && plutoY < d)
    {
      planet = "Pluto I like";
     planetweight = earthsize * pluto;
	
          
    }  
    
    else 
    {
        planet = "no planet";
    }
   
    output();
}

// send in x and y coordinates of center, radius, and Graphics g
// this method then calls the fillOval() method to draw the circle
public void fillCircle(int centerX, int centerY, int radius, Graphics g)
{
	int BreezyGUI_X, BreezyGUI_Y, BreezyGUI_Width, BreezyGUI_Height;
	BreezyGUI_X = centerX - radius;
	BreezyGUI_Y = centerY - radius;
	BreezyGUI_Width = 2 * radius;
	BreezyGUI_Height = 2 * radius;	
	g.fillOval(BreezyGUI_X,BreezyGUI_Y,BreezyGUI_Width,BreezyGUI_Height);	
}

// draw the planets
public void drawPlanets(Graphics g)
{
	
	int totaldist = 42;
        
        g.setColor (Color.black);
        g.fillRect(0,0,9999,9999);
        
        
        g.setColor(Color.orange);    
        mercuryX = (int)(mercurydist/totaldist*5000);
        mercuryY = 200;
        fillCircle(mercuryX, mercuryY, (int)(mercurysize*mult), g);
        g.drawString("Mercury", mercuryX + 10, mercuryY + 10);
        
        g.setColor(Color.green);
        venusX = (int)(venusdist/totaldist*5500);
        venusY = 150;
        fillCircle(venusX,venusY, (int)(venussize*mult), g);
        g.drawString("Venus", venusX + 15, venusY +15);
        
        g.setColor(Color.blue);
        earthX = (int)(earthdist/totaldist*5750);
        earthY = 400;
        fillCircle(earthX,earthY, (int)(45),g);
        g.drawString("Earth", earthX + 35, earthY + 35);
        
        g.setColor(Color.red);      
        marsX = (int)(marsdist/totaldist*6000);
        marsY = 250;
        fillCircle(marsX,marsY, (int)(marssize*mult), g);
        g.drawString("Mars", marsX + 10, marsY + 10);
       
        g.setColor(Color.orange);
        jupiterX = (int)(jupiterdist/totaldist*5000);
        jupiterY = 590;
        fillCircle(jupiterX,jupiterY, (int)(jupitersize*mult), g);
        g.drawString("Jupiter", jupiterX + 165, jupiterY + 165);
        
        g.setColor(Color.magenta);
        saturnX = (int)(saturndist/totaldist*4900);
        saturnY = 600;
        fillCircle(saturnX,saturnY, (int)(saturnsize*mult), g);
        g.drawString("Saturn", saturnX +135, saturnY + 135);
        
        g.setColor(Color.blue);
        uranusX = (int)(uranusdist/totaldist*3200);
        uranusY=750;
        fillCircle(uranusX,uranusY, (int)(uranussize*mult), g);
        g.drawString("Uranus", uranusX + 65,uranusY + 65);
        g.setColor(Color.cyan);
        neptuneX = (int)(neptunedist/totaldist*2200);
        neptuneY = 900;
        fillCircle(neptuneX,neptuneY, (int)(neptunesize*mult), g);
         g.drawString("Neptune", neptuneX + 70,neptuneY + 70);
        g.setColor(Color.gray);
        plutoX = (int) (neptunedist/totaldist*2500);
        plutoY = 140;
        fillCircle(plutoX,plutoY, (int)(plutosize*mult), g);
        g.drawString("Pluto",plutoX + 10,plutoY + 10);
	// example of calling the fillCircle() method
	// 'mercurysize' and 'mult' would need to be defined
	// the (int) is a 'cast' to convert a 'double' to an 'int'
	
	
	
		
}

// paint draws the graphics
public void paint(Graphics g)
{	iteration++;
	// this IF statement keeps getEarthWeight() from running
	// every time the graphics (the planets) are re-drawn:
	if (iteration == 1)
		getEarthWeight();
	drawPlanets(g);	
}	

// gets the user's weight on Earth
public void getEarthWeight()
{	String input;
	input = JOptionPane.showInputDialog("What is your weight (in pounds)?");
  	earthsize = Double.parseDouble(input);	
}
	
	
public static void main(String[] args)
{
   Frame frm = new PlanetWeight();
   frm.setSize (9999, 9999);               
   frm.setVisible (true); 
   
   
}	

}
