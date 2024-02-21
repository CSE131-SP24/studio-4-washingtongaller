package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	String shapeType=in.next();
	int redComponent=in.nextInt();
	int blueComponent=in.nextInt();
	int greenComponent=in.nextInt();
	boolean isFilled=in.nextBoolean();
	double a=in.nextDouble();
	double b=in.nextDouble();
	double c=in.nextDouble();
	double d=in.nextDouble();
	
	StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
	if (shapeType.equals("ellipse")) {
		if (isFilled == true);
		StdDraw.ellipse(a, b, c, d);
	}
	if (shapeType.equals("ellipse")) {
		if (isFilled == false) {
		StdDraw.filledEllipse(a, b, c, d);}
	}
	if (shapeType.equals("rectangle")) {
		if (isFilled == false) {
		StdDraw.rectangle(a, b, c, d);}
	}
	if (shapeType.equals("rectangle")) {
		if (isFilled == false) {
		StdDraw.rectangle(a, b, c, d);}
	}
	if (shapeType.equals("triangle")) {
		if(isFilled == true) {
			double e=in.nextDouble();
			double g=in.nextDouble();		
			double[] x = { a, c, e};
			double[] y = {b, d, g};
					StdDraw.filledPolygon(x, y);
		}
	}
	
	if (shapeType.equals("triangle")) {
		if(isFilled == false) {
		double e=in.nextDouble();
		double g=in.nextDouble();
		double[] x = { a, c, e};
		double[] y = {b, d, g};
		StdDraw.polygon(x, y);
		}
	}
	
}
	}
