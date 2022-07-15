package ColorChanger;

//Protan
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DAlgo {
	
	static String as;
	static int ty = 2;
	
	public DAlgo(String str) throws IOException {
		as = str;
		main(null);
		//return;
	}

	public static void main(String args[])
		throws IOException
	{
		BufferedImage img = null;
		File f = null;

		
		try {
			f = new File(
				""+as);
			img = ImageIO.read(f);
		}
		catch (IOException e) {
			System.out.println(e);
		}

		// get width and height
		int width = img.getWidth();
		int height = img.getHeight();

		// convert to red image
		for(int y = 0; y < height; y++)
	    {
	      for(int x = 0; x < width; x++)
	      {
	        //img = null;
			int p = img.getRGB(x,y);
	        int a = (p>>24) & 0xff;
	        int R = (p>>16) & 0xff;
	        int G = (p>>8) & 0xff;
	        int B = p & 0xff;

	        double newR;
	        double newG;
	        double newB;
	        //deu
	       
	        	newR = (0.36198*R + 0.86755*G + -0.22953*B);
		        newG = (0.26099*R + 0.64512*G + 0.09389*B);
		        newB = (-0.01975*R + 0.02686*G +0.99289*B);	
		        
		        if (newR > 255)
			          R = 255;
			        else
			          R = (int) newR;

			        if (newG > 255)
			          G = 255;
			        else
			          G = (int) newG;

			        if (newB > 255)
			          B = 255;
			        else
			          B = (int) newB;

			        p = (a<<24) | (R<<16) | (G<<8) | B;
			        img.setRGB(x, y, p);
	        }
	      }
	    
		
		//File fn = new File(as);
		
		// write image
		try {
			File fn = new File(as);
			String z = fn.getName();
			f = new File("C:/Users/Admin/eclipse-workspace2/ColorChanger/Deu/"+z);
			ImageIO.write(img, "jpg", f);
			String pic = "C:/Users/Admin/eclipse-workspace2/ColorChanger/Deu/"+z;
			ShowImg pth = new ShowImg(pic);
			pth.setVisible(true);
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}

	
	
}
